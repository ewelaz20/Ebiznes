package controllers

import javax.inject._
import models.About
import models.repositories.AboutRepository
import play.api.data.Form
import play.api.data.Forms.{mapping, _}
import play.api.libs.json.Json
import play.api.mvc._

import scala.util.{Failure, Success}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class AboutController @Inject()(messagesControllerComponents: MessagesControllerComponents, aboutRepository: AboutRepository)(implicit ec: ExecutionContext) extends MessagesAbstractController(messagesControllerComponents) {

  var about: Seq[About] = Seq[About]()


  val aboutForm: Form[AboutForm] = Form {
    mapping(
      "id" -> number,
      "about" -> nonEmptyText,

    )(AboutForm.apply)(AboutForm.unapply)
  }


  def updateAboutForm(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>


    aboutRepository.getById(id).map(a => {
      val filledUpdateForm = aboutForm.fill(AboutForm(a.id, a.about))
      Ok(views.html.aboutUpdate(filledUpdateForm, about))
    })

  }
  def saveUpdatedAbout(): Action[AnyContent] = Action.async { implicit request =>


    aboutForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.aboutUpdate(errorForm, about))
        )
      },
      a => {

        aboutRepository.update(About(a.id, a.about)).map { _ =>
          routes.AboutController.updateAboutForm(a.id)
          Ok("ok")
        }
      }
    )
  }


  def getAbout() = Action.async { implicit request: Request[AnyContent] =>
    val about = aboutRepository.getAboutData
    about.map(body =>
      Ok(Json.toJson(body))

    )
  }


}

case class AboutForm(id: Int, about: String)
