/*
 * Author: Henri Hietala
 */
 
var app = angular.module("app", ["ngResource", "ngRoute", "ui.sortable", "ui.bootstrap"])
.constant("apiUrl", "http://localhost:9000\:9000/api") // to tell AngularJS that 9000 is not a dynamic parameter
.config(["$routeProvider", function($routeProvider) {
    $routeProvider
      .when("/", {
        templateUrl: "/views/main",
        controller: "ListController"
      }).otherwise({
        redirectTo: "/"
      });
  }
  ]).config([
  "$locationProvider", function($locationProvider) {
    return $locationProvider.html5Mode(true).hashPrefix("!"); // enable the new HTML5 routing and history API
  }
]);