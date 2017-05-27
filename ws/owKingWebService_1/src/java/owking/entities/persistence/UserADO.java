package owking.entities.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import owking.entities.UserClass;
import owking.entities.ConnectionDB;


public class UserADO {

    private final String QUERY_FIND_USER = "SELECT * FROM `user` WHERE (`name` = 'ds' OR `email`= 'a' OR `battleTag`= 'b' ) AND `password` = 'fgd' ";
    private final String QUERY_FIND_ALL_USER = "SELECT * FROM `user`";
  
    //name, email, bt, pass
    public UserADO(){ }

    /**
     * This method is used to check if a user with this username and password exists
     * @param name
     * @param password
     * @param battleTag
     * @param email
     * @return UserClass, in case of error null
     */
    public UserClass getUserExist()
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
                PreparedStatement st = conn.prepareStatement(QUERY_FIND_USER);
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
