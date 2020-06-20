package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class PaymentController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def listOfPayments() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  def payment() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def paymentHandle(paymentId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def deletePayment(paymentId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
