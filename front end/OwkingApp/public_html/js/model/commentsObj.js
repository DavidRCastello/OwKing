function commentsObj ()
{
	//Attributes declaration
	this.id;
	this.position;
	this.commentType;
	this.text;
	this.userId;
	this.timestamp;
	this.likes;
	this.dislikes;
	this.parentId;
	
	//construct
	this.construct = function (id,position,commentType,text,userId,timestamp,likes,dislikes,parentId)
	{
		this.setId(id);
		this.setPosition(position);
		this.setCommentType(commentType);
		this.setText(text);
		this.setUserId(userId);
		this.setTimestamp(timestamp);
		this.setLikes(likes);
		this.setDislikes(dislikes);
		this.setParentId(parentId);	
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setPosition = function (position){this.position=position;}
	this.setCommentType = function (commentType){this.commentType=commentType;}
	this.setText = function (text){this.text=text;}
	this.setUserId = function (userId){this.userId=userId;}
	this.setTimestamp = function (timestamp){this.timestamp=timestamp;}
	this.setLikes = function (likes){this.likes=likes;}
	this.setDislikes = function (dislikes){this.dislikes=dislikes;}
	this.setParentId = function (parentId){this.parentId=parentId;}
	
	//getters
	this.getId = function () {return this.id;}
	this.getPosition = function (){return this.position;}
	this.getCommentType = function (){return this.commentType;}
	this.getText = function (){return this.text;}
	this.getUserId = function (){return this.userId;}
	this.getTimeStamp = function (){return this.timestamp;}
	this.getLikes = function (){return this.likes;}
	this.getDislikes = function (){return this.dislikes;}
	this.getParentId = function (){return this.parentId;}
	
}