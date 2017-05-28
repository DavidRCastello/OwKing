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
   }
