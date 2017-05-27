function pointsValueObj ()
{
	//Attributes declaration
	this.id;
	this.createPublicationValue;
	this.publicationTypeId;
	this.dislikeValue;
	this.likeValue;
	
	//construct
	this.construct = function (id,createPublicationValue,publicationTypeId,dislikeValue,likeValue)
	{
		this.setId(id);
		this.setCreatePublicationValue(createPublicationValue);
		this.setPublicationTypeId(createPublicationValue);
		this.setDislikeValue(dislikeValue);
		this.setLikeValue(likeValue);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setCreatePublicationValue = function (createPublicationValue){this.createPublicationValue=createPublicationValue;}
	this.setPublicationTypeId = function (publicationTypeId){this.publicationTypeId=publicationTypeId;}
	this.setDislikeValue = function (dislikeValue){this.dislikeValue=dislikeValue;}
	this.setLikeValue = function (likeValue){this.likeValue=likeValue;}
	
	//getters
	this.getId = function () {return this.id;}
	this.getCreatePublicationValue = function (){return this.createPublicationValue;}
	this.getPublicationTypeId = function (){return this.publicationTypeId;}
	this.getDislikeValue = function (){return this.dislikeValue;}
	this.getLikeValue = function (){return this.likeValue;}
	
}