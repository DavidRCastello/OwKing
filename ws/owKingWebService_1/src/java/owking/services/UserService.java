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
     * @param name
     * @param password
     * @param battleTag
     * @param email
     * @return UserClass, in case of error null
     */
    public UserClass login(){
        UserADO uADO = new UserADO();
        return uADO.getUserExist();
    }
    
        public UserClass allusers(){
        UserADO uADO = new UserADO();
        return uADO.allUsers();
    }
   }
