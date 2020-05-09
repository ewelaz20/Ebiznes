package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class BasketController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // add to basket
  def addToBasket(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  // delete from basket
  def deleteFromBasket(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  //basket form
  def basketForm() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
