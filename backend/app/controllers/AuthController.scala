package controllers

import javax.inject._
import models.User
import models.repositories.UsersRepository
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class AuthController @Inject()(val controllerComponents: ControllerComponents, usersRepository: UsersRepository)(implicit ec: ExecutionContext) extends BaseController {

  // user login
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

  // user register
  def userRegister() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userRegisterHandle() = Action.async { implicit request =>
    val user = request.body.asJson.get.as[User]
    val created = usersRepository.register(user)
    created.map(usr => Ok(Json.toJson(usr)))
  }

}
