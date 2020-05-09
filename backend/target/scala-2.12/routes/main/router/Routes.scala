// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/backend/conf/routes
// @DATE:Fri May 08 19:37:29 CEST 2020

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
  // @LINE:32
  BasketController_1: controllers.BasketController,
  // @LINE:37
  NewsletterController_3: controllers.NewsletterController,
  // @LINE:41
  AvailabilityController_10: controllers.AvailabilityController,
  // @LINE:44
  CategoryController_4: controllers.CategoryController,
  // @LINE:49
  ContactController_7: controllers.ContactController,
  // @LINE:53
  FavouriteController_6: controllers.FavouriteController,
  // @LINE:58
  PaymentController_5: controllers.PaymentController,
  // @LINE:66
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
    // @LINE:32
    BasketController_1: controllers.BasketController,
    // @LINE:37
    NewsletterController_3: controllers.NewsletterController,
    // @LINE:41
    AvailabilityController_10: controllers.AvailabilityController,
    // @LINE:44
    CategoryController_4: controllers.CategoryController,
    // @LINE:49
    ContactController_7: controllers.ContactController,
    // @LINE:53
    FavouriteController_6: controllers.FavouriteController,
    // @LINE:58
    PaymentController_5: controllers.PaymentController,
    // @LINE:66
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/category/""" + "$" + """categoryId<[^/]+>""", """controllers.ProductsController.getProductsByCategory(categoryId:Int)"""),
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
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteCategory/""" + "$" + """categoryId<[^/]+>""", """controllers.CategoryController.deleteCategory(categoryId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.ContactController.getContactData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact/publish""", """controllers.ContactController.sendContactEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fav/""" + "$" + """userId<[^/]+>""", """controllers.FavouriteController.getWishlistForUser(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kurwa""", """controllers.FavouriteController.addFav()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favDelete""", """controllers.FavouriteController.deleteFav()"""),
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
  private[this] lazy val controllers_ProductsController_getProductsByCategory11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/category/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_getProductsByCategory11_invoker = createInvoker(
    ProductsController_0.getProductsByCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "getProductsByCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """products/category/""" + "$" + """categoryId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductsController_addProduct12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductsController_addProduct12_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_ProductsController_addProductHandle13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_ProductsController_addProductHandle13_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_ProductsController_updateProduct14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_updateProduct14_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_ProductsController_updateProductHandle15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_ProductsController_updateProductHandle15_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_ProductsController_deleteProduct16_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_deleteProduct16_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_BasketController_basketForm17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_BasketController_basketForm17_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_BasketController_addToBasket18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_addToBasket18_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_BasketController_deleteFromBasket19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteFromBasket/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_deleteFromBasket19_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_NewsletterController_newsletterForm20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsletterForm")))
  )
  private[this] lazy val controllers_NewsletterController_newsletterForm20_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_NewsletterController_addToNewsletter21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToNewsletter/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NewsletterController_addToNewsletter21_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_AvailabilityController_notifyAvailability22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notify/"), DynamicPart("productId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AvailabilityController_notifyAvailability22_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_CategoryController_listOfCategories23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_listOfCategories23_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_CategoryController_addCategory24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCategory/"), DynamicPart("catName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_addCategory24_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_CategoryController_deleteCategory25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteCategory/"), DynamicPart("categoryId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory25_invoker = createInvoker(
    CategoryController_4.deleteCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """deleteCategory/""" + "$" + """categoryId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ContactController_getContactData26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_ContactController_getContactData26_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_ContactController_sendContactEmail27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact/publish")))
  )
  private[this] lazy val controllers_ContactController_sendContactEmail27_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_FavouriteController_getWishlistForUser28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fav/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavouriteController_getWishlistForUser28_invoker = createInvoker(
    FavouriteController_6.getWishlistForUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "getWishlistForUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """fav/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_FavouriteController_addFav29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kurwa")))
  )
  private[this] lazy val controllers_FavouriteController_addFav29_invoker = createInvoker(
    FavouriteController_6.addFav(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "addFav",
      Nil,
      "POST",
      this.prefix + """kurwa""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_FavouriteController_deleteFav30_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favDelete")))
  )
  private[this] lazy val controllers_FavouriteController_deleteFav30_invoker = createInvoker(
    FavouriteController_6.deleteFav(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavouriteController",
      "deleteFav",
      Nil,
      "DELETE",
      this.prefix + """favDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_PaymentController_listOfPayments31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentList")))
  )
  private[this] lazy val controllers_PaymentController_listOfPayments31_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_PaymentController_payment32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_PaymentController_payment32_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_PaymentController_paymentHandle33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentHandle/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_paymentHandle33_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_PaymentController_deletePayment34_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentDelete/"), DynamicPart("paymentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePayment34_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_Assets_versioned35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned35_invoker = createInvoker(
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
    case controllers_ProductsController_getProductsByCategory11_route(params@_) =>
      call(params.fromPath[Int]("categoryId", None)) { (categoryId) =>
        controllers_ProductsController_getProductsByCategory11_invoker.call(ProductsController_0.getProductsByCategory(categoryId))
      }
  
    // @LINE:25
    case controllers_ProductsController_addProduct12_route(params@_) =>
      call { 
        controllers_ProductsController_addProduct12_invoker.call(ProductsController_0.addProduct())
      }
  
    // @LINE:26
    case controllers_ProductsController_addProductHandle13_route(params@_) =>
      call { 
        controllers_ProductsController_addProductHandle13_invoker.call(ProductsController_0.addProductHandle())
      }
  
    // @LINE:27
    case controllers_ProductsController_updateProduct14_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_ProductsController_updateProduct14_invoker.call(ProductsController_0.updateProduct(productId))
      }
  
    // @LINE:28
    case controllers_ProductsController_updateProductHandle15_route(params@_) =>
      call { 
        controllers_ProductsController_updateProductHandle15_invoker.call(ProductsController_0.updateProductHandle())
      }
  
    // @LINE:29
    case controllers_ProductsController_deleteProduct16_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_ProductsController_deleteProduct16_invoker.call(ProductsController_0.deleteProduct(productId))
      }
  
    // @LINE:32
    case controllers_BasketController_basketForm17_route(params@_) =>
      call { 
        controllers_BasketController_basketForm17_invoker.call(BasketController_1.basketForm())
      }
  
    // @LINE:33
    case controllers_BasketController_addToBasket18_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_BasketController_addToBasket18_invoker.call(BasketController_1.addToBasket(productId))
      }
  
    // @LINE:34
    case controllers_BasketController_deleteFromBasket19_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_BasketController_deleteFromBasket19_invoker.call(BasketController_1.deleteFromBasket(productId))
      }
  
    // @LINE:37
    case controllers_NewsletterController_newsletterForm20_route(params@_) =>
      call { 
        controllers_NewsletterController_newsletterForm20_invoker.call(NewsletterController_3.newsletterForm())
      }
  
    // @LINE:38
    case controllers_NewsletterController_addToNewsletter21_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_NewsletterController_addToNewsletter21_invoker.call(NewsletterController_3.addToNewsletter(userId))
      }
  
    // @LINE:41
    case controllers_AvailabilityController_notifyAvailability22_route(params@_) =>
      call(params.fromPath[Long]("productId", None)) { (productId) =>
        controllers_AvailabilityController_notifyAvailability22_invoker.call(AvailabilityController_10.notifyAvailability(productId))
      }
  
    // @LINE:44
    case controllers_CategoryController_listOfCategories23_route(params@_) =>
      call { 
        controllers_CategoryController_listOfCategories23_invoker.call(CategoryController_4.listOfCategories())
      }
  
    // @LINE:45
    case controllers_CategoryController_addCategory24_route(params@_) =>
      call(params.fromPath[String]("catName", None)) { (catName) =>
        controllers_CategoryController_addCategory24_invoker.call(CategoryController_4.addCategory(catName))
      }
  
    // @LINE:46
    case controllers_CategoryController_deleteCategory25_route(params@_) =>
      call(params.fromPath[Int]("categoryId", None)) { (categoryId) =>
        controllers_CategoryController_deleteCategory25_invoker.call(CategoryController_4.deleteCategory(categoryId))
      }
  
    // @LINE:49
    case controllers_ContactController_getContactData26_route(params@_) =>
      call { 
        controllers_ContactController_getContactData26_invoker.call(ContactController_7.getContactData())
      }
  
    // @LINE:50
    case controllers_ContactController_sendContactEmail27_route(params@_) =>
      call { 
        controllers_ContactController_sendContactEmail27_invoker.call(ContactController_7.sendContactEmail())
      }
  
    // @LINE:53
    case controllers_FavouriteController_getWishlistForUser28_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_FavouriteController_getWishlistForUser28_invoker.call(FavouriteController_6.getWishlistForUser(userId))
      }
  
    // @LINE:54
    case controllers_FavouriteController_addFav29_route(params@_) =>
      call { 
        controllers_FavouriteController_addFav29_invoker.call(FavouriteController_6.addFav())
      }
  
    // @LINE:55
    case controllers_FavouriteController_deleteFav30_route(params@_) =>
      call { 
        controllers_FavouriteController_deleteFav30_invoker.call(FavouriteController_6.deleteFav())
      }
  
    // @LINE:58
    case controllers_PaymentController_listOfPayments31_route(params@_) =>
      call { 
        controllers_PaymentController_listOfPayments31_invoker.call(PaymentController_5.listOfPayments())
      }
  
    // @LINE:59
    case controllers_PaymentController_payment32_route(params@_) =>
      call { 
        controllers_PaymentController_payment32_invoker.call(PaymentController_5.payment())
      }
  
    // @LINE:60
    case controllers_PaymentController_paymentHandle33_route(params@_) =>
      call(params.fromPath[Long]("paymentId", None)) { (paymentId) =>
        controllers_PaymentController_paymentHandle33_invoker.call(PaymentController_5.paymentHandle(paymentId))
      }
  
    // @LINE:61
    case controllers_PaymentController_deletePayment34_route(params@_) =>
      call(params.fromPath[Long]("paymentId", None)) { (paymentId) =>
        controllers_PaymentController_deletePayment34_invoker.call(PaymentController_5.deletePayment(paymentId))
      }
  
    // @LINE:66
    case controllers_Assets_versioned35_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned35_invoker.call(Assets_9.versioned(path, file))
      }
  }
}
