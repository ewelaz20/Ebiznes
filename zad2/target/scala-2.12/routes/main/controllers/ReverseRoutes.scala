// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/ebiznes/zad2/conf/routes
// @DATE:Fri Apr 24 22:56:50 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:48
  class ReverseContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def getContactData(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:49
    def sendContactEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contact/publish")
    }
  
  }

  // @LINE:65
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:52
  class ReverseFavouriteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def addFav(productId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "favAdd/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:52
    def listOfFav(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fav")
    }
  
    // @LINE:54
    def deleteFav(productId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "favDelete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
  }

  // @LINE:36
  class ReverseNewsletterController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def newsletterForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newsletterForm")
    }
  
    // @LINE:37
    def addToNewsletter(userId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToNewsletter/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
  }

  // @LINE:40
  class ReverseAvailabilityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def notifyAvailability(productId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notify/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
  }

  // @LINE:57
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def paymentHandle(paymentId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paymentHandle/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paymentId", paymentId)))
    }
  
    // @LINE:58
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:57
    def listOfPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paymentList")
    }
  
    // @LINE:60
    def deletePayment(paymentId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "paymentDelete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paymentId", paymentId)))
    }
  
  }

  // @LINE:16
  class ReverseSettingsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def userLogout(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "userLogout")
    }
  
    // @LINE:16
    def userSettings(): Call = {
    
      () match {
      
        // @LINE:16
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "userSettings")
      
      }
    
    }
  
    // @LINE:19
    def deleteUser(userId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
  }

  // @LINE:43
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def addCategory(catName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("catName", catName)))
    }
  
    // @LINE:45
    def deleteCategory(catName:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteCategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("catName", catName)))
    }
  
    // @LINE:43
    def listOfCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def userRegisterHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userRegisterHandle")
    }
  
    // @LINE:11
    def userLoginHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userLoginHandle")
    }
  
    // @LINE:10
    def userLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userLogin")
    }
  
    // @LINE:12
    def userRegister(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userRegister")
    }
  
  }

  // @LINE:22
  class ReverseProductsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getProduct(productId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:22
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:27
    def updateProductHandle(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:25
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:28
    def deleteProduct(productId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:26
    def updateProduct(productId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:24
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
  }

  // @LINE:31
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def basketForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:32
    def addToBasket(productId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:33
    def deleteFromBasket(productId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteFromBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
  }


}
