package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class BasketController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def addToBasket(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def deleteFromBasket(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def basketForm() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
