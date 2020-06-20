package controllers

import javax.inject._
import models.repositories.NotifyRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class AvailabilityController @Inject()(val controllerComponents: ControllerComponents, val notifyRepository: NotifyRepository)(implicit ec: ExecutionContext) extends BaseController {

  def notifyAvailability(mail:String, productId:Long) = Action.async { implicit request: Request[AnyContent] =>
    notifyRepository.add2(mail,productId).map(x => Ok(Json.toJson(x)))

  }

}
