package controllers

import javax.inject._
import models.repositories.NewsletterRepository
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class NewsletterController @Inject()(val controllerComponents: ControllerComponents, val newletterRepository: NewsletterRepository)(implicit ec: ExecutionContext) extends BaseController {


  def addToNewsletter(mail: String) = Action.async { implicit request: Request[AnyContent] =>
    newletterRepository.add(mail).map(_ => Ok)
  }

  def newsletterForm() = Action { implicit request: Request[AnyContent] =>
    Ok
  }
}