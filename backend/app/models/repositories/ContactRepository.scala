package models.repositories

import javax.inject.{Inject, Singleton}
import models.Contact

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ContactRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._


  class ContactTable(tag: Tag) extends Table[Contact](tag, "contact") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def address = column[String]("address")
    def phone = column[String]("phone")
    def email = column[String]("email")




    def * = (id, address, phone, email) <> ((Contact.apply _).tupled, Contact.unapply)
  }


  private val contacts = TableQuery[ContactTable]

  def getById(id: Int): Future[Contact] = db.run {
    contacts.filter(_.id === id).result.head
  }
  def getContactD: Future[Contact] = db.run {
    contacts.result.head
  }


  def update(updatedAbout: Contact): Future[Unit] = {
    db.run(contacts.filter(_.id === updatedAbout.id).update(updatedAbout)).map(_ => ())
  }

}