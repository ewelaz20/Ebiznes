package controllers

import javax.inject._
import models.UserAccount
import models.repositories.UserAccountRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class UserAccountController @Inject()(val controllerComponents: ControllerComponents, userAccountRepository: UserAccountRepository)(implicit ec: ExecutionContext) extends BaseController {

  def addUserInformation() = Action { implicit request =>
    val userAccount = request.body.asJson.get.as[UserAccount]
    userAccountRepository.addUserInfo(userAccount)
    Ok(Json.toJson(userAccount))
  }

}
