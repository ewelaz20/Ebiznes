package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class NewsletterController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  // add to newsletter
  def addToNewsletter(userId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def newsletterForm() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
}
