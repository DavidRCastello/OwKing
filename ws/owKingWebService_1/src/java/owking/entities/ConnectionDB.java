package owking.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    
   private static final String DRIVER = "com.mysql.jdbc.Driver";    
//jdbc:mysql://localhost:3306/owking?zeroDateTimeBehavior=convertToNull
   private static final String BD_URL = "jdbc:mysql://"+"127.0.0.1/owking?zeroDateTimeBehavior=convertToNull";  

   private static final String USUARI = "root";

   private static final String PASSWORD = "";

    public ConnectionDB() throws ClassNotFoundException {
        Class.forName(this.DRIVER);       
    }
    
    /**
     * 
     * @return a connection 
     * @throws SQLException if a connection error occurs
     */
    public Connection getConnection() throws SQLException {
        Connection conn=DriverManager.getConnection(BD_URL, USUARI, PASSWORD);
        return conn;
    }
}

