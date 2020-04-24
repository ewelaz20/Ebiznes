// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/ebiznes/zad2/conf/routes
// @DATE:Fri Apr 24 22:56:50 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
