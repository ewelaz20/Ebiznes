package controllers


import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class AuthController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // user login
  def userLogin() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userLoginHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  // user register
  def userRegister() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userRegisterHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
