package models.repositories

import javax.inject.{Inject, Singleton}
import models.Newsletter
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class NewsletterRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class NewsletterTable(tag: Tag) extends Table[Newsletter](tag, "newsletter") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def mail = column[String]("mail")

    def * = (id, mail) <> ((Newsletter.apply _).tupled, Newsletter.unapply)
  }

  private val newsletter = TableQuery[NewsletterTable]

  def add(mail: String): Future[Newsletter] = db.run {
    (newsletter.map(c => c.mail)
      returning newsletter.map(_.id)
      into ((mail, id) => Newsletter(id, mail))
      ) += mail
  }
}


