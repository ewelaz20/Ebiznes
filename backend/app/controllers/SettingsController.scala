package controllers


import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class SettingsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // user settings
  def userSettings() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def userSettingsHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  // user logout
  def userLogout() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  // delete user
  def deleteUser(userId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
}
