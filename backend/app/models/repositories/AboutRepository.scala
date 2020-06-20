package models.repositories

import javax.inject.{Inject, Singleton}
import models.About

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class AboutRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class AboutTable(tag: Tag) extends Table[About](tag, "about") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def about = column[String]("about")

    def * = (id, about) <> ((About.apply _).tupled, About.unapply)
  }


  private val abouts = TableQuery[AboutTable]

  def getAboutData: Future[About] = db.run {
    abouts.result.head
  }

  def getById(aboutId: Int): Future[About] = db.run {
    abouts.filter(about => about.id === aboutId).result.head
  }

  def update(updatedAbout: About): Future[Unit] = {
    db.run(abouts.filter(_.id === updatedAbout.id).update(updatedAbout)).map(_ => ())
  }

}