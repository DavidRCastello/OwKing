function rightsObj ()
{
	//Attributes declaration
	this.id;
	this.canClosePost;
	this.logo;
	this.name;
	this.isBanned;
	this.canEditOther;
	this.canDeleteOther;
	this.canCreate;
	this.canMakePost;
	this.canDeleteAccount;

	//construct
	this.construct = function (id,canClosePost,logo,name,isBanned,canEditOther,canDeleteOther,canCreate,canMakePost,canDeleteAccount)
	{
		this.setId(id);
		this.setCanClosePost(canClosePost);
		this.setLogo(logo);
		this.setName(name);
		this.setIsBanned(isBanned);
		this.setCanEditOther(canEditOther);
		this.setCanDeleteOther(canDeleteOther);
		this.setCanCreate(canCreate);
		this.setCanMakePost(canMakePost);
		this.setCanDeleteAccount(canDeleteAccount);
	}
	
	//setters
	this.setId = function (id){this.id=id;}
	this.setCanClosePost = function (canClosePost){this.canClosePost=canClosePost;}
	this.setLogo = function (logo){this.logo=logo;}
	this.setName = function (name){this.name=name;}
	this.setIsBanned = function (isBanned){this.isBanned=isBanned;}
	this.setCanEditOther = function (canEditOther){this.canEditOther=canEditOther;}
	this.setCanDeleteOther = function (canDeleteOther){this.canDeleteOther=canDeleteOther;}
	this.setCanCreate = function (canCreate){this.canCreate=canCreate;}
	this.setCanMakePost = function (canMakePost){this.canMakePost=canMakePost;}
	this.setCanDeleteAccount = function (canDeleteAccount){this.canDeleteAccount=canDeleteAccount;}

	
	//getters
	this.getId = function () {return this.id;}
	this.getCanClosePost = function (){return this.canClosePost;}
	this.getLogo = function (){return this.logo;}
	this.getName = function (){return this.name;}
	this.getIsBanned = function (){return this.isBanned;}
	this.getCanEditOther = function (){return this.canEditOther;}
	this.getCanDeleteOther = function (){return this.canDeleteOther;}
	this.getCanCreate = function (){return this.canCreate;}
	this.getCanMakePost = function (){return this.canMakePost;}
	this.getCanDeleteAccount = function (){return this.canDeleteAccount;}

}