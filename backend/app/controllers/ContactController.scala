package controllers

import javax.inject._
import models.Contact
import play.api.data.Form
import play.api.data.Forms.{mapping, _}
import play.api.libs.json.Json
import play.api.mvc._

import scala.util.{Failure, Success}
import scala.concurrent.{ExecutionContext, Future}
import models.repositories.ContactRepository

import scala.concurrent.ExecutionContext

@Singleton
class ContactController @Inject()(messagesControllerComponents: MessagesControllerComponents, contactRepository: ContactRepository)(implicit ec: ExecutionContext) extends MessagesAbstractController(messagesControllerComponents){


  var contact: Seq[Contact] = Seq[Contact]()


  val contactForm: Form[ContactForm] = Form {
    mapping(
      "id" -> number,
      "address" -> nonEmptyText,
      "phone" -> nonEmptyText,
      "email" -> nonEmptyText,


    )(ContactForm.apply)(ContactForm.unapply)
  }


  def updateContactForm(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>


    contactRepository.getById(id).map(c => {
      val filledUpdateForm = contactForm.fill(ContactForm(c.id, c.address, c.phone, c.email))
      Ok(views.html.contactUpdate(filledUpdateForm, contact))
    })

  }
  def saveUpdateContact(): Action[AnyContent] = Action.async { implicit request =>


    contactForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.contactUpdate(errorForm, contact))
        )
      },
      c => {

        contactRepository.update(Contact(c.id, c.address, c.phone, c.email)).map { _ =>
          routes.ContactController.updateContactForm(c.id)
          Ok("ok")
        }
      }
    )
  }

  def getContactData() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }


  def getContactId(id: Int) = Action.async { implicit request: Request[AnyContent] =>
    val contact = contactRepository.getById(id)
    contact.map(body =>
      Ok(Json.toJson(body))

    )
  }

  def getContact() = Action.async { implicit request: Request[AnyContent] =>
    val contact = contactRepository.getContactD
    contact.map(body =>
      Ok(Json.toJson(body))

    )
  }

  def sendContactEmail() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
case class ContactForm(id: Int, address: String, phone: String, email: String)