function mosdulesTypesObj ()
{
	//Attributes declaration
	this.id;
	this.name;
	this.reference;
	
	//construct
	this.construct = function (id,name,reference)
	{
		this.setId(id);
		this.setName(name);
		this.setReference(reference);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setName = function (name){this.name=name;}
	this.setReference = function (reference){this.reference=reference;}
	
	//getters
	this.getId = function () {return this.id;}
	this.getName = function (){return this.name;}
	this.getReference = function (){return this.reference;}
	
}