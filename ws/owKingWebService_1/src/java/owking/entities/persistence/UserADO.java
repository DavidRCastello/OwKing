package owking.entities.persistence;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import owking.entities.UserClass;
import owking.entities.ConnectionDB;


public class UserADO {

    private final String QUERY_FIND_USER = "SELECT * FROM `user` where `name`=? ";
    private final String QUERY_FIND_ALL_USER = "SELECT * FROM `user`";
  
    //name, email, bt, pass
    public UserADO(){ }

    /**
     * This method is used to check if a user with this username and password exists
     * @param userName
     * @param password
     * @param battleTag
     * @param email
     * @return UserClass, in case of error null
     */
    public UserClass getUserExist(String userName,String password,String email,String battleTag)
    {
        
        if(userName == null) userName = " ";
        if(email == null) email = " ";
        if(battleTag == null) battleTag = " ";
        
        String sql = "SELECT * FROM `user` where (`name`='"+userName+"' OR `battleTag`='"+battleTag+"' OR `email`='"+email+"' ) AND `password`='"+password+"';";
        //
        int result = -1;
        UserClass checkuser=null;

        try{
            ConnectionDB db = new ConnectionDB();
            Connection conn = null;
            try {
                conn = db.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (conn != null)
            {
                System.out.println(sql);
                PreparedStatement st = conn.prepareStatement(sql);
                //st.setString(1,userName);
                /*st.setString(2,password);
                st.setString(3,"");
                st.setString(4,"");*/
                ResultSet rs = st.executeQuery();
                

                while(rs.next())
                {
                    checkuser = resultsetToUser(rs);
                }
            }

        }catch(ClassNotFoundException | SQLException e) {
            checkuser = null;
        }


        return checkuser;
    }
    
    public UserClass allUsers()
    {
        int result = -1;
        UserClass checkuser=null;

        try{
            ConnectionDB db = new ConnectionDB();
            Connection conn = null;
            try {
                conn = db.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (conn != null)
            {
                PreparedStatement st = conn.prepareStatement(QUERY_FIND_ALL_USER);
     
                ResultSet rs = st.executeQuery();

                while(rs.next())
                {
                    checkuser = resultsetToUser(rs);
                }
            }

        }catch(Exception e) {
            checkuser = null;
        }


        return checkuser;
    }
    
    
    private UserClass resultsetToUser(ResultSet rs) throws SQLException {
        UserClass u = null;
        
        String id = rs.getString("user.id");
        int totalPoints = rs.getInt("user.totalPoints");
        String name = rs.getString("user.name");
        String battleName = rs.getString("user.battleName");
        String battleTag = rs.getString("user.battleTag");
        String logo = rs.getString("user.logo");
        String finalStatisticsId = rs.getString("user.finalStatisticsId");
        String gradeId = rs.getString("user.gradeId");
        String email = rs.getString("user.email");
        String password = rs.getString("user.password");
        String twitter = rs.getString("user.twitter");
        String twitch = rs.getString("user.twitch");
        String rightsId = rs.getString("user.rightsId");
        String description = rs.getString("user.description");
        Timestamp registerDate = rs.getTimestamp("user.registerDate");
        Timestamp lastConnectionDate = rs.getTimestamp("user.lastConnectionDate");
        Boolean isActive = rs.getBoolean("user.isActive");

        u = new UserClass(id,totalPoints,name,battleName,battleTag,logo,finalStatisticsId,gradeId,email,password,twitter,twitch,rightsId,description,registerDate,lastConnectionDate,isActive);

        return u;
    }

}
