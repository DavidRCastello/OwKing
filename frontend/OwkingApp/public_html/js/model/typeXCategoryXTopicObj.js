function typeXCategoryXTopic ()
{
	//Attributes declaration
	this.id;
	this.topicId;
	this.categoryId;
	this.typeId;

	//construct
	this.construct = function (id,topicId,categoryId,typeId)
	{
		this.setId(id);
		this.setTopicId(topicId);
		this.categoryId(categoryId);
		this.typeId(typeId);
		
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setTopicId = function (topicId){this.topicId=topicId;}
	this.setCategoryId = function (categoryId){this.categoryId=categoryId;}
	this.setTypeId = function (typeId){this.typeId=typeId;}
	
	
	//getters
	this.getId = function () {return this.id;}
	this.getTopicId = function (){return this.topicId;}
	this.getCategoryId = function (){return this.categoryId;}
	this.getTypeId = function (){return this.typeId;}
	
}