(function (){
	var indexApp = angular.module("indexApp", []);
	
	indexApp.controller("indexController", function ($scope, $http){

		this.user= new userObj();
		this.newUser = [];
		
		$("#wrongLogin").hide();
		
		this.login =function ()
		{
			var outPutData = new Array();
			var userToPass = new userObj();
			
			if(this.user.getName().match("#")) userToPass.setBattleTag(this.user.getName());
			else if(this.user.getName().match("@")) userToPass.setEmail(this.user.getName());
			else userToPass.setName(this.user.getName());
		   
			userToPass.setPassword(this.user.getPassword());
			//userToPass = angular.copy(userToPass);
			
			$http({
				method: 'GET',
                url: 'url',
                data: userToPass
			}).then(function (response) {
				console.log(response, 'res');
				outPutData = data;
			},function (error){
				console.log(error, " can't get data.");
			});
           
			if(outPutData[0])	
			{
				this.userLogged = new Array();
				
				if(outPutData[1])
				{			
					var user= new userObj();
					user.construct(outPutData[1].id,outPutData[1].totalPoints,outPutData[1].name,outPutData[1].battleName,outPutData[1].battleTag,outPutData[1].logo,outPutData[1].finalStatisticsId,outPutData[1].gradeId,outPutData[1].email,outPutData[1].password,outPutData[1].twitter,outPutData[1].twitch,outPutData[1].rightsId,outPutData[1].description,outPutData[1].registerDate,outPutData[1].lastConnectionDate);
					this.userLogged.push(user);
						
					if(!typeof(Storage))
					{
						alert("This browser does not accept local variables");
					}
					else
					{
						if(user.getActive()==1)
						{
							sessionStorage.setItem("userConnected", JSON.stringify(user));			
							$("#login").hide();
							$("#wrongLogin").html("");
							$("#wrongLogin").hide();
						}
						else 
						{
							$("#wrongLogin").html("Error, your user is inactive");		
							$("#wrongLogin").fadeIn();
						}	
					}
				}else 
				{
					$("#wrongLogin").html("Error, incorrect username or password");		
					$("#wrongLogin").fadeIn();
				}	
			}
		   
		}
    
	});
	
	/**
	DIRECTIVES SECTION
	To charge templates
	**/
	indexApp.directive("logIn", function (){
        return {
			restrict: 'E',
			templateUrl:"templates/log-in.html",
			controller:function(){
             
			},
			controllerAs: 'logIn'
        };
	});
	
	indexApp.directive("aboutPage", function (){
        return {
			restrict: 'E',
			templateUrl:"templates/about-page.html",
			controller:function(){
             
			},
			controllerAs: 'aboutPage'
        };
	});
    
})();




