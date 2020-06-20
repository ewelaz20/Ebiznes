package models.repositories

import javax.inject.{Inject, Singleton}
import models.Notify

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class NotifyRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider, val productsRepository: ProductsRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]


  import dbConfig._
  import profile.api._
  import productsRepository.ProductTable


  class NotifyTable(tag: Tag) extends Table[Notify](tag, "notify") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def mail = column[String]("mail")

    def product = column[Long]("product")

    def product_fk = foreignKey("product_fk", product, products)(_.id)

    def * = (id, mail, product) <> ((Notify.apply _).tupled, Notify.unapply)
  }

  private val notifyP = TableQuery[NotifyTable]
  private val products = TableQuery[ProductTable]


  def add(notification:Notify): Future[Notify] = db.run {
    notifyP returning notifyP.map(_.id) into ((notification, id) => notification.copy(id = id)) += notification
  }

  def add2(mail:String,productId:Long): Future[Notify] = db.run {
    notifyP returning notifyP.map(_.id) into ((notification, id) => notification.copy(id = id)) += new Notify(0,mail,productId)
  }

}