package controllers

import com.mohiva.play.silhouette.api.Silhouette
import javax.inject._
import models.UserAccount
import models.UserData
import models.repositories.UserAccountRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._
import auth.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class UserAccountController @Inject()(cc: MessagesControllerComponents,
                                      silhouette: Silhouette[DefaultEnv],
                                      val controllerComponents: ControllerComponents,
                                      userAccountRepository: UserAccountRepository)(implicit ec: ExecutionContext) extends BaseController {

  def addUserInformation() = silhouette.SecuredAction.async { implicit request =>
    val userData = request.body.asJson.get.as[UserData]
    val userAccount = UserAccount(request.identity.id,userData.firstName,userData.lastName,userData.address,userData.zip,userData.phone,userData.email)
    println(userAccount)
    userAccountRepository.addUserInfo(userAccount)
    Future(Ok(Json.toJson(userAccount)))
  }

}
