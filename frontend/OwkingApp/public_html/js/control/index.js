(function (){
    var indexApp = angular.module("indexApp", []);
	
    indexApp.controller("indexController", function ($scope, $http){

        this.user= new userObj();
        this.newUser = [];
        this.password2 = "";

            $("#wrongLogin").hide();
            
        this.showRegister=function()
        {
            $("#about").hide();
            $("#login").hide();
            $("#register").show();
        }

        this.login =function ()
        {
            var outPutData = new Array();
            var userToPass = new userObj();

            if(this.user.getName().match("#")) userToPass.setBattleTag(this.user.getName());
            else if(this.user.getName().match("@")) userToPass.setEmail(this.user.getName());
            else userToPass.setName(this.user.getName());
            userToPass.setPassword(this.user.getPassword());

            var data = $.param({
               name: userToPass.getName(),
               password: userToPass.getPassword(),
               email: userToPass.getEmail(),
               battleTag: userToPass.getBattleTag()
           });

            var config = {
                headers : {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;',
                    'dataType': 'text'
                }
            }

            $http.post('http://localhost:8084/owKingWebService_1/restful/users/login', data, config)

            .then(function (data, status, headers, config) {
                outPutData = data;
            })
            .then(function (data, status, header, config) {
                $scope.ResponseDetails = "Data: " + data +
                    "<hr />status: " + status +
                    "<hr />headers: " + header +
                    "<hr />config: " + config;
            })            ;

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
                                    this.user.name = "";
                                    this.user.password = "";
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

    this.register = function(){
       
       if(this.user.password === this.password2)
       {
            var flag = false;
            var arrayBattle = this.user.battleTag.split("#");
            var data = $.param({
                name: this.user.getName(),
                battleName: arrayBattle[0],
                battleTag: arrayBattle[1],
                email: this.user.getEmail(),
                password: this.user.getPassword(),
            });

            var config = {
                headers : {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;',
                    'dataType': 'text'
                }
            }

            $http.post('http://localhost:8084/owKingWebService_1/restful/users/register', data, config)
            .then(function (data, status, headers, config) {
                flag = data[0];
            })
            .then(function (data, status, header, config) {
                $scope.ResponseDetails = "Data: " + data +
                    "<hr />status: " + status +
                    "<hr />headers: " + header +
                    "<hr />config: " + config;
            })
            ;


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
                                            this.user.name = "";
                                            this.user.password = "";
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

        };
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
    
    indexApp.directive("signUp", function (){
        return {
                    restrict: 'E',
                    templateUrl:"templates/sign-up.html",
                    controller:function(){

                    },
                    controllerAs: 'signUp'
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

