package models

import play.api.libs.json.{Json, OFormat}

case class UserAccount(user: String, firstName: String, lastName: String, address:String, zip:String, phone:String, email:String)

object UserAccount {
  implicit val userFormat: OFormat[UserAccount] = Json.format[UserAccount]
}