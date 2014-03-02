
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html data-ng-app="app" data-ng-controller="AppCtrl">
<head>
	<meta charset="UTF-8">
	<title>todo</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.47*/routes/*6.53*/.Assets.at("third/bootstrap/css/bootstrap.min.css"))),format.raw/*6.104*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.47*/routes/*7.53*/.Assets.at("third/bootstrap/css/bootstrap-theme.min.css"))),format.raw/*7.110*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("third/fontawesome/css/font-awesome.min.css"))),format.raw/*8.109*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/styles.min.css"))),format.raw/*9.93*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.52*/routes/*10.58*/.Assets.at("images/favicon.png"))),format.raw/*10.90*/("""">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>
</head>
<body>
	<div role="main" class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="clearfix">
					<div class="logo pull-left">
						<img src=""""),_display_(Seq[Any](/*19.18*/routes/*19.24*/.Assets.at("images/todo_logo.png"))),format.raw/*19.58*/("""" alt="todo" />
					</div>
					<div class="toolbar pull-right">
						<a href="#" class="fa fa-info-circle fa-2x" data-toggle="modal" data-target="#helpModal"></a>
					</div>
				</div>
				<!-- as the route changes, the AngularJS view will be dynamically rendered and populated -->
				<div data-ng-view></div>
			</div>
		</div>
	</div>

	"""),_display_(Seq[Any](/*31.3*/help())),format.raw/*31.9*/("""
	
	<script src=""""),_display_(Seq[Any](/*33.16*/routes/*33.22*/.Assets.at("third/jquery/jquery-1.10.2.min.js"))),format.raw/*33.69*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*34.16*/routes/*34.22*/.Assets.at("third/bootstrap/js/bootstrap.min.js"))),format.raw/*34.71*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*35.16*/routes/*35.22*/.Assets.at("third/jquery-ui/jquery-ui.min.js"))),format.raw/*35.68*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*36.16*/routes/*36.22*/.Assets.at("third/angularjs/angular.min.js"))),format.raw/*36.66*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*37.16*/routes/*37.22*/.Assets.at("third/angularjs/angular-route.js"))),format.raw/*37.68*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*38.16*/routes/*38.22*/.Assets.at("third/angularjs/angular-resource.min.js"))),format.raw/*38.75*/("""" type="text/javascript"></script>

	<script src=""""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Assets.at("javascripts/app.js"))),format.raw/*40.54*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*41.16*/routes/*41.22*/.Assets.at("javascripts/directives.js"))),format.raw/*41.61*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*42.16*/routes/*42.22*/.Assets.at("third/angular-ui/ui-bootstrap/ui-bootstrap-custom-tpls-0.10.0.min.js"))),format.raw/*42.104*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*43.16*/routes/*43.22*/.Assets.at("third/angular-ui/sortable.js"))),format.raw/*43.64*/("""" type="text/javascript"></script>
	<script src=""""),_display_(Seq[Any](/*44.16*/routes/*44.22*/.Assets.at("javascripts/controllers.js"))),format.raw/*44.62*/("""" type="text/javascript"></script>

	<script src=""""),_display_(Seq[Any](/*46.16*/routes/*46.22*/.Assets.at("javascripts/main.js"))),format.raw/*46.55*/("""" type="text/javascript"></script>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 02 12:36:57 EET 2014
                    SOURCE: D:/Ohjelmat/play-2.1.5/samples/scala/test/eventual/app/views/index.scala.html
                    HASH: 06665d0349fd81a94f0f728988e86e46584ff34c
                    MATRIX: 569->0|777->173|791->179|864->230|949->280|963->286|1042->343|1127->393|1141->399|1219->455|1304->505|1318->511|1379->551|1470->606|1485->612|1539->644|1877->946|1892->952|1948->986|2340->1343|2367->1349|2423->1369|2438->1375|2507->1422|2594->1473|2609->1479|2680->1528|2767->1579|2782->1585|2850->1631|2937->1682|2952->1688|3018->1732|3105->1783|3120->1789|3188->1835|3275->1886|3290->1892|3365->1945|3454->1998|3469->2004|3523->2036|3610->2087|3625->2093|3686->2132|3773->2183|3788->2189|3893->2271|3980->2322|3995->2328|4059->2370|4146->2421|4161->2427|4223->2467|4312->2520|4327->2526|4382->2559
                    LINES: 22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|40->19|40->19|40->19|52->31|52->31|54->33|54->33|54->33|55->34|55->34|55->34|56->35|56->35|56->35|57->36|57->36|57->36|58->37|58->37|58->37|59->38|59->38|59->38|61->40|61->40|61->40|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|65->44|65->44|65->44|67->46|67->46|67->46
                    -- GENERATED --
                */
            