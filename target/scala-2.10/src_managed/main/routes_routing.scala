// @SOURCE:D:/Ohjelmat/play-2.1.5/samples/scala/test/eventual/conf/routes
// @HASH:64dbd09597237fb5fd021d80dbb9d27aeaa16889
// @DATE:Fri Feb 28 21:42:40 EET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_loadPublicHTML1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/"),DynamicPart("any", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Lanes_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/lanes"))))
        

// @LINE:13
private[this] lazy val controllers_Lanes_create3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/lanes/new"))))
        

// @LINE:14
private[this] lazy val controllers_Lanes_show4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/lanes/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_Lanes_update5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/lanes/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Lanes_delete6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/lanes/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_Application_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("any", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index(any:String = "none")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/$any<.+>""","""controllers.Application.loadPublicHTML(any:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/lanes""","""controllers.Lanes.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/lanes/new""","""controllers.Lanes.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/lanes/$id<[^/]+>""","""controllers.Lanes.show(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/lanes/$id<[^/]+>""","""controllers.Lanes.update(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/lanes/$id<[^/]+>""","""controllers.Lanes.delete(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$any<.+>""","""controllers.Application.index(any:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call(Param[String]("any", Right("none"))) { (any) =>
        invokeHandler(controllers.Application.index(any), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_loadPublicHTML1(params) => {
   call(params.fromPath[String]("any", None)) { (any) =>
        invokeHandler(controllers.Application.loadPublicHTML(any), HandlerDef(this, "controllers.Application", "loadPublicHTML", Seq(classOf[String]),"GET", """ Play routes serving HTML to AngularJS start with /views""", Routes.prefix + """views/$any<.+>"""))
   }
}
        

// @LINE:12
case controllers_Lanes_index2(params) => {
   call { 
        invokeHandler(controllers.Lanes.index, HandlerDef(this, "controllers.Lanes", "index", Nil,"GET", """ Play routes serving JSON to AngularJS start with /api""", Routes.prefix + """api/lanes"""))
   }
}
        

// @LINE:13
case controllers_Lanes_create3(params) => {
   call { 
        invokeHandler(controllers.Lanes.create, HandlerDef(this, "controllers.Lanes", "create", Nil,"POST", """""", Routes.prefix + """api/lanes/new"""))
   }
}
        

// @LINE:14
case controllers_Lanes_show4(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Lanes.show(id), HandlerDef(this, "controllers.Lanes", "show", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/lanes/$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_Lanes_update5(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Lanes.update(id), HandlerDef(this, "controllers.Lanes", "update", Seq(classOf[String]),"POST", """""", Routes.prefix + """api/lanes/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Lanes_delete6(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Lanes.delete(id), HandlerDef(this, "controllers.Lanes", "delete", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """api/lanes/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:22
case controllers_Application_index8(params) => {
   call(params.fromPath[String]("any", None)) { (any) =>
        invokeHandler(controllers.Application.index(any), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String]),"GET", """ Redirect all unknown routes to the index page""", Routes.prefix + """$any<.+>"""))
   }
}
        
}
    
}
        