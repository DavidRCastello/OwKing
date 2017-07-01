package owking.services;


import owking.entities.UserClass;

import owking.entities.persistence.UserADO;


/**
 *
 * @author AMS
 */
public class UserService {
    
    public UserService(){
       
    }

    /**
     * This method is used to call the method login of UserADO
     * @param userReceived
     * @return UserClass, in case of error null
     */
    public UserClass login(String userName,String password,String email,String battleTag){
        UserADO uADO = new UserADO();
        return uADO.getUserExist(userName,password,email,battleTag);
    }
    
    public UserClass allusers(){
        UserADO uADO = new UserADO();
        return uADO.allUsers();
    }
    
    public Boolean register(String userName,String battleName,String battleTag,String logo,String email,String password,String twitter,String twitch,String description){
        UserADO uADO = new UserADO();
        return uADO.register( userName, battleName, battleTag, logo, email, password, twitter, twitch, description);
    }    
        
   }
/*private String name;	
    private String battleName;
    private String battleTag;
    private String logo;
    private String email;
    private String password;
    private String twitter;
    private String twitch;
    private String description;
*/