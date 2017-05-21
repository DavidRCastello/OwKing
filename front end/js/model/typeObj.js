function typeObj ()
{
	//Attributes declaration
	this.id;
	this.name;

	//construct
	this.construct = function (id,name)
	{
		this.setId(id);
		this.setName(name);
		
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setName = function (name){this.name=name;}
	
	
	//getters
	this.getId = func	tion () {return this.id;}
	this.getName = function (){return this.name;}
	
}