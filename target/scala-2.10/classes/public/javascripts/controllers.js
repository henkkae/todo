/*
 * Author: Henri Hietala
 */

 function keke(){
 	$('a[data-toggle="tooltip"]').tooltip();
 }

// the global controller
app.controller("AppCtrl", ["$scope", "$location", function($scope, $location) {
	// the very sweet go function is inherited to all other controllers
	$scope.go = function (path) {
		$location.path(path);
	};
}]);

// the list controller
app.controller("ListController", ["$scope", "$resource", "apiUrl", function($scope, $resource, apiUrl) {
	var Lanes = $resource(apiUrl + "/lanes"); // a RESTful-capable resource object
	$scope.lanes = Lanes.query(); // for the list of tasks in public/html/main.html

	$scope.$on('$viewContentLoaded', keke() );
}]);


// the edit controller
app.controller("LaneController", ["$scope", "$resource", "$routeParams", "$timeout", "apiUrl", function($scope, $resource, $routeParams, $timeout, apiUrl) {
	var ShowLane = $resource(apiUrl + "/lanes/:id", {id:"@id"}); // a RESTful-capable resource object
	if ($routeParams.id) {
		// retrieve the corresponding task from the database
		// $scope.task.id.$oid is now populated so the Delete button will appear in the detailForm in public/html/detail.html
		$scope.lane = ShowLane.get({id: $routeParams.id});
		$scope.dbContent = ShowLane.get({id: $routeParams.id}); // this is used in the noChange function

	}



	$scope.sortableOptions = {
    placeholder: "task",
    connectWith: ".tasks",
    update: function(e, ui) {
      $scope.save();
  	}
  };

	$scope.dropSuccessHandler = function($event,index,array){
		array.splice(index,1);
		$scope.save();
	};
	$scope.onDrop = function($event,$data,array){
		array.push($data);
		$scope.save();
	};
	
	// decide whether to enable or not the button Save in the detailForm in public/html/detail.html 
	$scope.noChange = function() {
		return angular.equals($scope.lane, $scope.dbContent);
	};

	// add task to a lane
	$scope.addTask = function($index) {
		$scope.lane.tasks.push(
			{
				orderno: '0',
				name: '',
				description: ''
			}
		);
		$scope.lane.tasks[$scope.lane.tasks.length-1].editing = true;

		$scope.save();
	};

	// to update a lane
	$scope.save = function() {
		var UpdateLane = $resource(apiUrl + "/lanes/" + $scope.lane.id.$oid); // a RESTful-capable resource object
		UpdateLane.save($scope.lane); // $scope.lane comes from the detailForm in public/html/detail.html
		$timeout(function() { $scope.go('/'); }); // go back to public/html/main.html
	};

	// to delete a task
	$scope.deleteTask = function($index) {
		$scope.lane.tasks.splice($index,1);
		$scope.save();
	};
	
	// to delete a lane
	$scope.delete = function() {
		var DeleteLane = $resource(apiUrl + "/lanes/" + $scope.lane.id.$oid); // a RESTful-capable resource object
		DeleteLane.delete(); // $scope.lane comes from the detailForm in public/html/detail.html
		$timeout(function() { $scope.go('/'); }); // go back to public/html/main.html
	};
}]);