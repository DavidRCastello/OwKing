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
     * @param name
     * @param password
     * @param email
     * @param battleTag
     * @return Response
     */
    //http://provenapps.cat:8080/RestFulFindMyPet/restful/users/login/
    //@Path("login")
    @Path("login") 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response login(){
        Map<String, Object> mapping = new HashMap<>();
        
        serviceUser = new UserService();
        UserClass user = serviceUser.login();
      
        return Response.ok(user).build();              
    }
    
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
