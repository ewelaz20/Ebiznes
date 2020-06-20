package models.repositories

import javax.inject.{Inject, Singleton}
import models.UserAccount
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserAccountRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider, val usersRepository: UsersRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]


  import dbConfig._
  import profile.api._
  import usersRepository.UserTable

  class UserAccountTable(tag: Tag) extends Table[UserAccount](tag, "userAccount") {


    def user = column[Long]("user")

    def firstName = column[String]("firstName")
    def lastName = column[String]("latName")

    def address = column[String]("address")

    def zip = column[String]("zip")

    def phone = column[String]("phone")

    def email = column[String]("email")


    def user_fk = foreignKey("user_fk", user, users)(_.id)

    def * = (user, firstName, lastName, address, zip, phone, email) <> ((UserAccount.apply _).tupled, UserAccount.unapply)
  }


  private val userAccounts = TableQuery[UserAccountTable]
  private val users = TableQuery[UserTable]

  def addUserInfo(user: UserAccount): Unit = db.run {
    userAccounts += user
  }
}