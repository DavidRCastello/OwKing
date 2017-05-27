function publicationObj ()
{
	//Attributes declaration
	this.id;
	this.userId;
	this.text;
	this.likes;
	this.dislikes;
	this.timestamp;
	this.typeXCatXTopicId;
	this.title;
	this.views;
	this.photo;
	this.description;
	this.contentId;
	
	//construct
	this.construct = function (id,userId,text,likes,dislikes,timestamp,typeXCatXTopicId,title,views,photo,description,contentId)
	{
		this.setId(id);
		this.setUserId(userId);
		this.setText(text);
		this.setLikes(likes);
		this.setDislikes(dislikes);
		this.setTimestamp(timestamp);
		this.setTypeXCatXTopicId(typeXCatXTopicId);
		this.setTitle(title);
		this.setViews(views);
		this.setPhoto(photo);
		this.setDescription(description);
		this.setContentId(contentId);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setUserId = function (userId){this.userId=userId;}
	this.setText = function (text){this.text=text;}
	this.setLikes = function (likes){this.likes=likes;}
	this.setDislikes = function (dislikes){this.dislikes=dislikes;}
	this.setTimestamp = function (timestamp){this.timestamp=timestamp;}
	this.setTypeXCatXTopicId = function (typeXCatXTopicId){this.typeXCatXTopicId=typeXCatXTopicId;}
	this.setTitle = function (title){this.title=title;}
	this.setViews = function (views){this.views=views;}
	this.setPhoto = function (photo){this.photo=photo;}
	this.setDescription = function (description){this.description=description;}
	this.setContentId = function (contentId){this.contentId=contentId;}
	
	//getters
	this.getId = function () {return this.id;}
	this.getUserId = function (){return this.userId;}
	this.getText = function (){return this.text;}
	this.getLikes = function (){return this.likes;}
	this.getDislikes = function (){return this.dislikes;}
	this.getTimestamp = function (){return this.timestamp;}
	this.getTypeXCatXTopicId = function (){return this.typeXCatXTopicId;}
	this.getTitle = function (){return this.title;}
	this.getViews = function (){return this.views;}
	this.getPhoto = function (){return this.photo;}
	this.getDescription = function (){return this.description;}
	this.getContentId = function (){return this.contentId;}
}