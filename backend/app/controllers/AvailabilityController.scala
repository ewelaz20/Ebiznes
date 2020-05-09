package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class AvailabilityController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // notify availability
  def notifyAvailability(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
