function modulesTypes ()
{
	//Attributes declaration
	this.id;
	this.name;
	this.logo;
	this.minRange;
	this.maxRange;

	//construct
	this.construct = function (id,name,logo,minRange,maxRange)
	{
		this.setId(id);
		this.setName(name);
		this.setLogo(logo);
		this.setMinRange(minRange);
		this.setMaxRange(maxRange);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setName = function (name){this.name=name;}
	this.setLogo = function (logo){this.logo=logo;}
	this.setMinRange = function (minRange){this.minRange=minRange;}
	this.setMaxRange = function (maxRange){this.maxRange=maxRange;}
	
	
	//getters
	this.getId = function () {return this.id;}
	this.getName = function (){return this.name;}
	this.getLogo = function (){return this.logo;}
	this.getMinRange = function (){return this.minRange;}
	this.getMaxRange = function (){return this.maxRange;}
	
}