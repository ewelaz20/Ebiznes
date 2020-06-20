package controllers


import javax.inject._
import play.api.mvc._


@Singleton
class SettingsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def userSettings() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userSettingsHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userLogout() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def deleteUser(userId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
}
