package controllers

import javax.inject._
import models.User
import models.repositories.UsersRepository
import play.api.i18n.I18nSupport
import play.api.libs.json.Json
import play.api.mvc._
import com.mohiva.play.silhouette.api.Silhouette
import scala.concurrent.ExecutionContext



@Singleton
class AuthController @Inject()(val controllerComponents: ControllerComponents,usersRepository: UsersRepository) (implicit ec: ExecutionContext) extends BaseController {

  def userLogin() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userLoginHandle() = Action.async { implicit request: Request[AnyContent] =>
    val usr = request.body.asJson.get.as[User]
    usersRepository.getFuture(usr).map(usrOption => usrOption match {
      case Some(found) => Ok(Json.toJson(found))
      case None => Unauthorized(Json.toJson(usr))
    })
  }

  def userRegister() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userRegisterHandle() = Action.async { implicit request =>
    val user = request.body.asJson.get.as[User]
    val created = usersRepository.register(user)
    created.map(usr => Ok(Json.toJson(usr)))
  }

}
