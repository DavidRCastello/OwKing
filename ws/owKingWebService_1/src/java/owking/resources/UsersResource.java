package owking.resources;


import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import owking.entities.UserClass;
import owking.services.UserService;


/**
 *
 * @author AMS
 * Exemple Accés al servei GET: 
 * http://localhost:8080/RestFulFindMyPet/restful/users
 */
@Path("users")
public class UsersResource {
    
    UserService serviceUser;
 
    
    public UsersResource(){        
      
    }
   
    /**
     * This method is used to generate a JSON data
     * @param <error>
     * @param user1
     * @param userName
     * @param password
     * @param email
     * @param battleTag
     * @return Response
     */
    //http://provenapps.cat:8080/RestFulFindMyPet/restful/users/login/
    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response login(@FormParam("name")String userName,@FormParam("password")String password,@FormParam("email")String email,@FormParam("battleTag")String battleTag){
        Map<String, Object> mapping = new HashMap<>();
        
        serviceUser = new UserService();
        UserClass user = serviceUser.login(userName,password,email,battleTag);
        return Response.ok(user).build();            
    }

    
    //http://localhost:8084/owKingWebService_1/restful/users/allusers
    @Path("allusers") 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response allusers(){
        Map<String, Object> mapping = new HashMap<>();
        
        serviceUser = new UserService();
        UserClass user = serviceUser.allusers();
        return Response.ok(user).build();              
    }
}
