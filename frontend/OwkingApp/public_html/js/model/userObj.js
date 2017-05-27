function userObj ()
{
	//Attributes declaration
	this.id;
	this.totalPoints;
	this.name;	
	this.battleName;
	this.battleTag;
	this.logo;
	this.finalStatisticsId;
	this.gradeId;
	this.email;
	this.password;
	this.twitter;
	this.twitch;
	this.rightsId;
	this.description;
	this.registerDate;
	this.lastConnectionDate;
	this.isActive;
	
	//construct
	this.construct = function (id,totalPoints,name,battleName,battleTag,logo,finalStatisticsId,gradeId,email,password,twitter,twitch,rightsId,description,registerDate,lastConnectionDate,isActive)
	{
		this.setId(id);
		this.setTotalPoints(totalPoints)
		this.setName(name);
		this.setBattleName(battleName);
		this.setBattleTag(battleTag);
		this.setLogo(logo);
		this.setFinalStatisticsId(finalStatisticsId);
		this.setGradeId(gradeId);
		this.setEmail(email);
		this.setPassword(password);
		this.setTwitter(twitter);
		this.setTwitch(twitch);
		this.setRightsId(rightsId);
		this.setDescription(description);
		this.setRegisterDate(registerDate);
		this.setLastConnectionDate(lastConnectionDate);
		this.setIsActive(isActive);
		
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setTotalPoints = function (totalPoints){this.totalPoints=totalPoints;}
	this.setName = function (name){this.name=name;}
	this.setBattleName = function (battleName){this.battleName=battleName;}
	this.setBattleTag = function (battleTag){this.battleTag=battleTag;}
	this.setLogo = function (logo){this.logo=logo;}
	this.setFinalStatisticsId = function (finalStatisticsId){this.finalStatisticsId=finalStatisticsId;}
	this.setGradeId = function (gradeId){this.gradeId=gradeId;}
	this.setEmail = function (email){this.email=email;}
	this.setPassword = function (password){this.password=password;}
	this.setTwitter = function (twitter){this.twitter=twitter;}
	this.setTwitch = function (twitch){this.twitch=twitch;}
	this.setRightsId = function (rightsId){this.rightsId=rightsId;}
	this.setDescription = function (description){this.description=description;}
	this.setRegisterDate = function (registerDate){this.registerDate=registerDate;}
	this.setLastConnectionDate = function (lastConnectionDate){this.lastConnectionDate=lastConnectionDate;}
	this.setIsActive = function (isActive){this.isActive=isActive;}
	
	
	//getters
	this.getId = function () {return this.id;}
	this.getTotalPoints = function (){return this.totalPoints;}
	this.getName = function (){return this.name;}
	this.getBattleName = function (){return this.battleName;}
	this.getBattleTag = function (){return this.battleTag;}
	this.getLogo = function (){return this.logo;}
	this.getFinalStatisticsId = function (){return this.finalStatisticsId;}
	this.getGradeId = function (){return this.gradeId;}
	this.getEmail = function (){return this.email;}
	this.getPassword = function (){return this.password;}
	this.getTwitter = function (){return this.twitter;}
	this.getTwitch = function (){return this.twitch;}
	this.getRightsId = function (){return this.rightsId;}
	this.getDescription = function (){return this.description;}
	this.getRegisterDate = function (){return this.registerDate;}
	this.getLastConnectionDate = function (){return this.lastConnectionDate;}
	this.getIsActive = function (){return this.isActive;}

	
}