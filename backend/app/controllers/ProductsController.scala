package controllers

import javax.inject._
import models.{Product, Size}
import models.repositories.{ProductsRepository, SizesRepository}
import play.api.data.Form
import play.api.data.Forms.{mapping, _}
import play.api.libs.json.Json
import play.api.mvc._

import scala.util.{Failure, Success}
import scala.concurrent.{ExecutionContext, Future}


@Singleton
class ProductsController @Inject()(messagesControllerComponents: MessagesControllerComponents, productsRepository: ProductsRepository, sizesRepository: SizesRepository)(implicit ec: ExecutionContext) extends MessagesAbstractController(messagesControllerComponents) {

  var products: Seq[Product] = Seq[Product]()
  var sizes : Seq[Size] = Seq[Size]()


  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText,
      "reference" -> nonEmptyText,
      "description" -> nonEmptyText,
      "quantity" -> number,
      "price" -> number,
      "status" -> nonEmptyText,
      "category" -> number,
      "image" -> nonEmptyText
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }


  val updateProductForm: Form[UpdateProductForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText,
      "reference" -> nonEmptyText,
      "description" -> nonEmptyText,
      "quantity" -> number,
      "price" -> number,
      "status" -> nonEmptyText,
      "image" -> nonEmptyText,
      "category" -> number
    )(UpdateProductForm.apply)(UpdateProductForm.unapply)
  }

  val deleteProductForm: Form[DeleteProductForm] = Form {
    mapping(
      "id" -> longNumber
    )(DeleteProductForm.apply)(DeleteProductForm.unapply)
  }


  val sizeForm: Form[CreateSizeForm] = Form {
    mapping(
      "product" -> number,
      "value" -> nonEmptyText

    )(CreateSizeForm.apply)(CreateSizeForm.unapply)
  }

  val deleteSizeForm: Form[DeleteSizeForm] = Form {
    mapping(
      "product" -> number,
      "value" -> nonEmptyText

    )(DeleteSizeForm.apply)(DeleteSizeForm.unapply)
  }

  def addProductForm(): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val formProduct = productsRepository.list()
    for {
      products <- formProduct
    } yield Ok(views.html.productCreate(productForm, products))
  }



  def saveAddedProduct(): Action[AnyContent] = Action.async { implicit request =>

    productForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productCreate(errorForm, products))
        )
      },
      product => {
        println(product)
        val p = new Product(product.id, product.name, product.reference, product.description, product.quantity, product.price, product.status,  product.image, product.category)
        productsRepository.addProduct(p).map { _ =>
          routes.ProductsController.addProductForm()
          Ok("ok")
        }
      }
    )
  }

  def updateProductForm(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>

    productsRepository.getById(id).map(product => {
      val filledUpdateForm = updateProductForm.fill(UpdateProductForm(product.id, product.name, product.reference, product.description, product.quantity, product.price.toInt, product.status,  product.image, product.category))
      Ok(views.html.productUpdate(filledUpdateForm, products))
    })

  }
  def saveUpdatedProduct(): Action[AnyContent] = Action.async { implicit request =>

    updateProductForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productUpdate(errorForm, products))
        )
      },
      product => {

        productsRepository.update(Product(product.id, product.name, product.reference, product.description, product.quantity, product.price, product.status,  product.image, product.category)).map { _ =>
          routes.ProductsController.updateProductForm(product.id)
          Ok("ok")
        }
      }
    )
  }

  def deleteForm(id: Long): Action[AnyContent] = Action.async { implicit request =>
    productsRepository.getById(id).map(product => {
      val deletePForm = deleteProductForm.fill(DeleteProductForm(product.id))
      Ok(views.html.productDelete(deletePForm, products))
    })
  }

  def deleteHandle(): Action[AnyContent] = Action.async { implicit request =>
    deleteProductForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productDelete(errorForm, products))
        )
      },
      product => {

        productsRepository.delete(product.id).map { _ =>
          routes.ProductsController.deleteForm(product.id)
          Ok("ok")
        }
      }
    )
  }



  def addSizeForm(): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val formProduct = productsRepository.list()
    for {
      products <- formProduct
    } yield Ok(views.html.sizeCreate(sizeForm, sizes))
  }



  def saveAddedSize(): Action[AnyContent] = Action.async { implicit request =>
    sizeForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.sizeCreate(errorForm, sizes))
        )
      },
      s => {

        sizesRepository.addSize(Size(s.product, s.value)).map { _ =>
          routes.ProductsController.addSizeForm()
          Ok("ok")
        }
      }
    )
  }



  def deleteSizeForm(product: Int): Action[AnyContent] = Action.async { implicit request =>
    sizesRepository.getByProductMapping(product).map(sizes => {
      val deleteSForm = deleteSizeForm.fill(DeleteSizeForm(product,""))
      Ok(views.html.sizeDelete(deleteSForm, sizes))
    })
  }

  def deleteSizeHandle(): Action[AnyContent] = Action.async { implicit request =>
    deleteSizeForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.sizeDelete(errorForm, sizes))
        )
      },
      s => {
        println(s)
        sizesRepository.delete(new Size(s.product, s.value)).map { _ =>
          routes.ProductsController.deleteSizeForm(s.product)
          Redirect("/display-products")
          Ok("ok")
        }
      }
    )
  }




  def addProductHandle() = Action.async { implicit request: Request[AnyContent] =>
    val product: Product = request.body.asJson.get.as[Product]
    val response = productsRepository.addProduct(product)
    response.map(productResponse => Ok(Json.toJson(productResponse)))
  }

  // delete
  def deleteProduct(productId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def getProducts() = Action.async { implicit request: Request[AnyContent] =>
    val productList = productsRepository.list()
    productList.map(products =>
      Ok(Json.toJson(products))
    )
  }

  def getProductsByCategory(categoryId: Int) = Action.async { implicit request: Request[AnyContent] =>
    val productList = productsRepository.getByCategory(categoryId)
    productList.map(products =>
      Ok(Json.toJson(products))
    )
  }

  def getProduct(productId: Long) = Action.async { implicit request: Request[AnyContent] =>
    val product = productsRepository.getById(productId)
    println("GETTING IT")
    product.map(body =>
      Ok(Json.toJson(body))

    )
  }

  def getSizeForProduct(productId: Long) = Action.async { implicit request: Request[AnyContent] =>
    val sizes = sizesRepository.getByProductId(productId)
    sizes.map(body =>
      Ok(Json.toJson(body))
    )
  }


  def updateProduct(productId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def updateProductHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }




}


case class CreateProductForm(id: Long, name: String, reference:String , description: String, quantity: Int, price: Int, status: String, category: Int, image: String)
case class UpdateProductForm(id: Long, name: String, reference:String , description: String, quantity: Int, price: Int, status: String,  image: String, category: Int)
case class DeleteProductForm(id: Long)
case class CreateSizeForm(product: Int, value: String)
case class DeleteSizeForm(product: Int, value: String)


