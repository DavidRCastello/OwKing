function contentObj ()
{
	//Attributes declaration
	this.id;
	this.structure;
	this.typeId;
	
	//construct
	this.construct = function (id,structure,typeId)
	{
		this.setId(id);
		this.setStructure(structure);
		this.setTypeId(typeId);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setStructure = function (structure){this.structure=structure;}
	this.setTypeId = function (typeId){this.typeId=typeId;}
	
	//getters
	this.getId = function () {return this.id;}
	this.getStructure = function (){return this.structure;}
	this.getTypeId = function (){return this.typeId;}
	
}