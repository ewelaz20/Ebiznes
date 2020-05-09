package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class ContactController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getContactData() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def sendContactEmail() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}