// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/ebiznes/zad2/conf/routes
// @DATE:Fri Apr 24 22:56:50 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_11: controllers.HomeController,
  // @LINE:10
  AuthController_8: controllers.AuthController,
  // @LINE:16
  SettingsController_2: controllers.SettingsController,
  // @LINE:22
  ProductsController_0: controllers.ProductsController,
  // @LINE:31
  BasketController_1: controllers.BasketController,
  // @LINE:36
  NewsletterController_3: controllers.NewsletterController,
  // @LINE:40
  AvailabilityController_10: controllers.AvailabilityController,
  // @LINE:43
  CategoryController_4: controllers.CategoryController,
  // @LINE:48
  ContactController_7: controllers.ContactController,
  // @LINE:52
  FavouriteController_6: controllers.FavouriteController,
  // @LINE:57
  PaymentController_5: controllers.PaymentController,
  // @LINE:65
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_11: controllers.HomeController,
    // @LINE:10
    AuthController_8: controllers.AuthController,
    // @LINE:16
    SettingsController_2: controllers.SettingsController,
    // @LINE:22
    ProductsController_0: controllers.ProductsController,
    // @LINE:31
    BasketController_1: controllers.BasketController,
    // @LINE:36
    NewsletterController_3: controllers.NewsletterController,
    // @LINE:40
    AvailabilityController_10: controllers.AvailabilityController,
    // @LINE:43
    CategoryController_4: controllers.CategoryController,
    // @LINE:48
    ContactController_7: controllers.ContactController,
    // @LINE:52
    FavouriteController_6: controllers.FavouriteController,
    // @LINE:57
    PaymentController_5: controllers.PaymentController,
    // @LINE:65
    Assets_9: controllers.Assets
  ) = this(errorHandler, HomeController_11, AuthController_8, SettingsController_2, ProductsController_0, BasketController_1, NewsletterController_3, AvailabilityController_10, CategoryController_4, ContactController_7, FavouriteController_6, PaymentController_5, Assets_9, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_11, AuthController_8, SettingsController_2, ProductsController_0, BasketController_1, NewsletterController_3, AvailabilityController_10, CategoryController_4, ContactController_7, FavouriteController_6, PaymentController_5, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userLogin""", """controllers.AuthController.userLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userLoginHandle""", """controllers.AuthController.userLoginHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userRegister""", """controllers.AuthController.userRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userRegisterHandle""", """controllers.AuthController.userRegisterHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userSettings""", """controllers.SettingsController.userSettings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userSettingsHandle""", """controllers.SettingsController.userSettings()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userLogout""", """controllers.SettingsController.userLogout()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """userId<[^/]+>""", """controllers.SettingsController.deleteUser(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """productId<[^/]+>""", """controllers.ProductsController.getProduct(productId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductsController.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducthandle""", """controllers.ProductsController.addProductHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproduct/""" + "$" + """productId<[^/]+>""", """controllers.ProductsController.updateProduct(productId:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproducthandle""", """controllers.ProductsController.updateProductHandle()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """productId<[^/]+>""", """controllers.ProductsController.deleteProduct(productId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.BasketController.basketForm()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """productId<[^/]+>""", """controllers.BasketController.addToBasket(productId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteFromBasket/""" + "$" + """productId<[^/]+>""", """controllers.BasketController.deleteFromBasket(productId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsletterForm""", """controllers.NewsletterController.newsletterForm()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToNewsletter/""" + "$" + """userId<[^/]+>""", """controllers.NewsletterController.addToNewsletter(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notify/""" + "$" + """productId<[^/]+>""", """controllers.AvailabilityController.notifyAvailability(productId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.listOfCategories()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCategory/""" + "$" + """catName<[^/]+>""", """controllers.CategoryController.addCategory(catName:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteCategory/""" + "$" + """catName<[^/]+>""", """controllers.CategoryController.deleteCategory(catName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.ContactController.getContactData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact/publish""", """controllers.ContactController.sendContactEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fav""", """controllers.FavouriteController.listOfFav()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favAdd/""" + "$" + """productId<[^/]+>""", """controllers.FavouriteController.addFav(productId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favDelete/""" + "$" + """productId<[^/]+>""", """controllers.FavouriteController.deleteFav(productId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentList""", """controllers.PaymentController.listOfPayments()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.PaymentController.payment()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentHandle/""" + "$" + """paymentId<[^/]+>""", """controllers.PaymentController.paymentHandle(paymentId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentDelete/""" + "$" + """paymentId<[^/]+>""", """controllers.PaymentController.deletePayment(paymentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_11.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AuthController_userLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userLogin")))
  )
  private[this] lazy val controllers_AuthController_userLogin1_invoker = createInvoker(
    AuthController_8.userLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "userLogin",
      Nil,
      "GET",
      this.prefix + """userLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AuthController_userLoginHandle2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userLoginHandle")))
  )
  private[this] lazy val controllers_AuthController_userLoginHandle2_invoker = createInvoker(
    AuthController_8.userLoginHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "userLoginHandle",
      Nil,
      "POST",
      this.prefix + """userLoginHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AuthController_userRegister3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userRegister")))
  )
  private[this] lazy val controllers_AuthController_userRegister3_invoker = createInvoker(
    AuthController_8.userRegister(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "userRegister",
      Nil,
      "GET",
      this.prefix + """userRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AuthController_userRegisterHandle4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userRegisterHandle")))
  )
  private[this] lazy val controllers_AuthController_userRegisterHandle4_invoker = createInvoker(
    AuthController_8.userRegisterHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "userRegisterHandle",
      Nil,
      "POST",
      this.prefix + """userRegisterHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SettingsController_userSettings5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userSettings")))
  )
  private[this] lazy val controllers_SettingsController_userSettings5_invoker = createInvoker(
    SettingsController_2.userSettings(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SettingsController",
      "userSettings",
      Nil,
      "GET",
      this.prefix + """userSettings""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SettingsController_userSettings6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userSettingsHandle")))
  )
  private[this] lazy val controllers_SettingsController_userSettings6_invoker = createInvoker(
    SettingsController_2.userSettings(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SettingsController",
      "userSettings",
      Nil,
      "POST",
      this.prefix + """userSettingsHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SettingsController_userLogout7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userLogout")))
  )
  private[this] lazy val controllers_SettingsController_userLogout7_invoker = createInvoker(
    SettingsController_2.userLogout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SettingsController",
      "userLogout",
      Nil,
      "DELETE",
      this.prefix + """userLogout""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_SettingsController_deleteUser8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SettingsController_deleteUser8_invoker = createInvoker(
    SettingsController_2.deleteUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SettingsController",
      "deleteUser",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ProductsController_getProducts9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_getProducts9_invoker = createInvoker(
    ProductsController_0.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductsController_getProduct10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_getProduct10_invoker = createInvoker(
    ProductsController_0.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductsController_addProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductsController_addProduct11_invoker = createInvoker(
    ProductsController_0.addProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductsController_addProductHandle12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_ProductsController_addProductHandle12_invoker = createInvoker(
    ProductsController_0.addProductHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "addProductHandle",
      Nil,
      "POST",
      this.prefix + """addproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProductsController_updateProduct13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_updateProduct13_invoker = createInvoker(
    ProductsController_0.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateproduct/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProductsController_updateProductHandle14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_ProductsController_updateProductHandle14_invoker = createInvoker(
    ProductsController_0.updateProductHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "updateProductHandle",
      Nil,
      "PUT",
      this.prefix + """updateproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProductsController_deleteProduct15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_deleteProduct15_invoker = createInvoker(
    ProductsController_0.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "deleteProduct",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """delete/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_BasketController_basketForm16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_BasketController_basketForm16_invoker = createInvoker(
    BasketController_1.basketForm(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "basketForm",
      Nil,
      "GET",
      this.prefix + """basket""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BasketController_addToBasket17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_addToBasket17_invoker = createInvoker(
    BasketController_1.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "addToBasket",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """addToBasket/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BasketController_deleteFromBasket18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteFromBasket/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_deleteFromBasket18_invoker = createInvoker(
    BasketController_1.deleteFromBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "deleteFromBasket",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """deleteFromBasket/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_NewsletterController_newsletterForm19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsletterForm")))
  )
  private[this] lazy val controllers_NewsletterController_newsletterForm19_invoker = createInvoker(
    NewsletterController_3.newsletterForm(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsletterController",
      "newsletterForm",
      Nil,
      "GET",
      this.prefix + """newsletterForm""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_NewsletterController_addToNewsletter20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToNewsletter/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsletterController_addToNewsletter20_invoker = createInvoker(
    NewsletterController_3.addToNewsletter(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsletterController",
      "addToNewsletter",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """addToNewsletter/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AvailabilityController_notifyAvailability21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notify/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AvailabilityController_notifyAvailability21_invoker = createInvoker(
    AvailabilityController_10.notifyAvailability(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AvailabilityController",
      "notifyAvailability",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """notify/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CategoryController_listOfCategories22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_listOfCategories22_invoker = createInvoker(
    CategoryController_4.listOfCategories(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "listOfCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CategoryController_addCategory23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCategory/"), DynamicPart("catName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_addCategory23_invoker = createInvoker(
    CategoryController_4.addCategory(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addCategory/""" + "$" + """catName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_CategoryController_deleteCategory24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteCategory/"), DynamicPart("catName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory24_invoker = createInvoker(
    CategoryController_4.deleteCategory(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """deleteCategory/""" + "$" + """catName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ContactController_getContactData25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_ContactController_getContactData25_invoker = createInvoker(
    ContactController_7.getContactData(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "getContactData",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ContactController_sendContactEmail26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact/publish")))
  )
  private[this] lazy val controllers_ContactController_sendContactEmail26_invoker = createInvoker(
    ContactController_7.sendContactEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "sendContactEmail",
      Nil,
      "POST",
      this.prefix + """contact/publish""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_FavouriteController_listOfFav27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fav")))
  )
  private[this] lazy val controllers_FavouriteController_listOfFav27_invoker = createInvoker(
    FavouriteController_6.listOfFav(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "listOfFav",
      Nil,
      "GET",
      this.prefix + """fav""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_FavouriteController_addFav28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favAdd/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavouriteController_addFav28_invoker = createInvoker(
    FavouriteController_6.addFav(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "addFav",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """favAdd/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_FavouriteController_deleteFav29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favDelete/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavouriteController_deleteFav29_invoker = createInvoker(
    FavouriteController_6.deleteFav(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "deleteFav",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """favDelete/""" + "$" + """productId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_PaymentController_listOfPayments30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentList")))
  )
  private[this] lazy val controllers_PaymentController_listOfPayments30_invoker = createInvoker(
    PaymentController_5.listOfPayments(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "listOfPayments",
      Nil,
      "GET",
      this.prefix + """paymentList""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_PaymentController_payment31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_PaymentController_payment31_invoker = createInvoker(
    PaymentController_5.payment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_PaymentController_paymentHandle32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentHandle/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_paymentHandle32_invoker = createInvoker(
    PaymentController_5.paymentHandle(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "paymentHandle",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """paymentHandle/""" + "$" + """paymentId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_PaymentController_deletePayment33_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentDelete/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePayment33_invoker = createInvoker(
    PaymentController_5.deletePayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "deletePayment",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """paymentDelete/""" + "$" + """paymentId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Assets_versioned34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned34_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_11.index)
      }
  
    // @LINE:10
    case controllers_AuthController_userLogin1_route(params@_) =>
      call { 
        controllers_AuthController_userLogin1_invoker.call(AuthController_8.userLogin())
      }
  
    // @LINE:11
    case controllers_AuthController_userLoginHandle2_route(params@_) =>
      call { 
        controllers_AuthController_userLoginHandle2_invoker.call(AuthController_8.userLoginHandle())
      }
  
    // @LINE:12
    case controllers_AuthController_userRegister3_route(params@_) =>
      call { 
        controllers_AuthController_userRegister3_invoker.call(AuthController_8.userRegister())
      }
  
    // @LINE:13
    case controllers_AuthController_userRegisterHandle4_route(params@_) =>
      call { 
        controllers_AuthController_userRegisterHandle4_invoker.call(AuthController_8.userRegisterHandle())
      }
  
    // @LINE:16
    case controllers_SettingsController_userSettings5_route(params@_) =>
      call { 
        controllers_SettingsController_userSettings5_invoker.call(SettingsController_2.userSettings())
      }
  
    // @LINE:17
    case controllers_SettingsController_userSettings6_route(params@_) =>
      call { 
        controllers_SettingsController_userSettings6_invoker.call(SettingsController_2.userSettings())
      }
  
    // @LINE:18
    case controllers_SettingsController_userLogout7_route(params@_) =>
      call { 
        controllers_SettingsController_userLogout7_invoker.call(SettingsController_2.userLogout())
      }
  
    // @LINE:19
    case controllers_SettingsController_deleteUser8_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_SettingsController_deleteUser8_invoker.call(SettingsController_2.deleteUser(userId))
      }
  
    // @LINE:22
    case controllers_ProductsController_getProducts9_route(params@_) =>
      call { 
        controllers_ProductsController_getProducts9_invoker.call(ProductsController_0.getProducts)
      }
  
    // @LINE:23
    case controllers_ProductsController_getProduct10_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_ProductsController_getProduct10_invoker.call(ProductsController_0.getProduct(productId))
      }
  
    // @LINE:24
    case controllers_ProductsController_addProduct11_route(params@_) =>
      call { 
        controllers_ProductsController_addProduct11_invoker.call(ProductsController_0.addProduct())
      }
  
    // @LINE:25
    case controllers_ProductsController_addProductHandle12_route(params@_) =>
      call { 
        controllers_ProductsController_addProductHandle12_invoker.call(ProductsController_0.addProductHandle())
      }
  
    // @LINE:26
    case controllers_ProductsController_updateProduct13_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_ProductsController_updateProduct13_invoker.call(ProductsController_0.updateProduct(productId))
      }
  
    // @LINE:27
    case controllers_ProductsController_updateProductHandle14_route(params@_) =>
      call { 
        controllers_ProductsController_updateProductHandle14_invoker.call(ProductsController_0.updateProductHandle())
      }
  
    // @LINE:28
    case controllers_ProductsController_deleteProduct15_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_ProductsController_deleteProduct15_invoker.call(ProductsController_0.deleteProduct(productId))
      }
  
    // @LINE:31
    case controllers_BasketController_basketForm16_route(params@_) =>
      call { 
        controllers_BasketController_basketForm16_invoker.call(BasketController_1.basketForm())
      }
  
    // @LINE:32
    case controllers_BasketController_addToBasket17_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_BasketController_addToBasket17_invoker.call(BasketController_1.addToBasket(productId))
      }
  
    // @LINE:33
    case controllers_BasketController_deleteFromBasket18_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_BasketController_deleteFromBasket18_invoker.call(BasketController_1.deleteFromBasket(productId))
      }
  
    // @LINE:36
    case controllers_NewsletterController_newsletterForm19_route(params@_) =>
      call { 
        controllers_NewsletterController_newsletterForm19_invoker.call(NewsletterController_3.newsletterForm())
      }
  
    // @LINE:37
    case controllers_NewsletterController_addToNewsletter20_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_NewsletterController_addToNewsletter20_invoker.call(NewsletterController_3.addToNewsletter(userId))
      }
  
    // @LINE:40
    case controllers_AvailabilityController_notifyAvailability21_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_AvailabilityController_notifyAvailability21_invoker.call(AvailabilityController_10.notifyAvailability(productId))
      }
  
    // @LINE:43
    case controllers_CategoryController_listOfCategories22_route(params@_) =>
      call { 
        controllers_CategoryController_listOfCategories22_invoker.call(CategoryController_4.listOfCategories())
      }
  
    // @LINE:44
    case controllers_CategoryController_addCategory23_route(params@_) =>
      call(params.fromPath[String]("catName", None)) { (catName) =>
        controllers_CategoryController_addCategory23_invoker.call(CategoryController_4.addCategory(catName))
      }
  
    // @LINE:45
    case controllers_CategoryController_deleteCategory24_route(params@_) =>
      call(params.fromPath[String]("catName", None)) { (catName) =>
        controllers_CategoryController_deleteCategory24_invoker.call(CategoryController_4.deleteCategory(catName))
      }
  
    // @LINE:48
    case controllers_ContactController_getContactData25_route(params@_) =>
      call { 
        controllers_ContactController_getContactData25_invoker.call(ContactController_7.getContactData())
      }
  
    // @LINE:49
    case controllers_ContactController_sendContactEmail26_route(params@_) =>
      call { 
        controllers_ContactController_sendContactEmail26_invoker.call(ContactController_7.sendContactEmail())
      }
  
    // @LINE:52
    case controllers_FavouriteController_listOfFav27_route(params@_) =>
      call { 
        controllers_FavouriteController_listOfFav27_invoker.call(FavouriteController_6.listOfFav())
      }
  
    // @LINE:53
    case controllers_FavouriteController_addFav28_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_FavouriteController_addFav28_invoker.call(FavouriteController_6.addFav(productId))
      }
  
    // @LINE:54
    case controllers_FavouriteController_deleteFav29_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_FavouriteController_deleteFav29_invoker.call(FavouriteController_6.deleteFav(productId))
      }
  
    // @LINE:57
    case controllers_PaymentController_listOfPayments30_route(params@_) =>
      call { 
        controllers_PaymentController_listOfPayments30_invoker.call(PaymentController_5.listOfPayments())
      }
  
    // @LINE:58
    case controllers_PaymentController_payment31_route(params@_) =>
      call { 
        controllers_PaymentController_payment31_invoker.call(PaymentController_5.payment())
      }
  
    // @LINE:59
    case controllers_PaymentController_paymentHandle32_route(params@_) =>
      call(params.fromPath[Long]("paymentId", None)) { (paymentId) =>
        controllers_PaymentController_paymentHandle32_invoker.call(PaymentController_5.paymentHandle(paymentId))
      }
  
    // @LINE:60
    case controllers_PaymentController_deletePayment33_route(params@_) =>
      call(params.fromPath[Long]("paymentId", None)) { (paymentId) =>
        controllers_PaymentController_deletePayment33_invoker.call(PaymentController_5.deletePayment(paymentId))
      }
  
    // @LINE:65
    case controllers_Assets_versioned34_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned34_invoker.call(Assets_9.versioned(path, file))
      }
  }
}
