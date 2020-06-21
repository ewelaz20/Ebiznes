package models.repositories

import javax.inject.{Inject, Singleton}
import models.{UserAccount, UserTable}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.TableQuery

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserAccountRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]
  val users = TableQuery[UserTable]
  private val userAccounts = TableQuery[UserAccountTable]


  import dbConfig._
  import profile.api._

  class UserAccountTable(tag: Tag) extends Table[UserAccount](tag, "userAccount") {


    def user = column[String]("user")

    def firstName = column[String]("firstName")
    def lastName = column[String]("latName")

    def address = column[String]("address")

    def zip = column[String]("zip")

    def phone = column[String]("phone")

    def email = column[String]("email")


    def userFk = foreignKey("user_fk", user, users)(_.id)

    def * = (user, firstName, lastName, address, zip, phone, email) <> ((UserAccount.apply _).tupled, UserAccount.unapply)
  }




  def addUserInfo(user: UserAccount): Unit = db.run {
    userAccounts += user
  }
}