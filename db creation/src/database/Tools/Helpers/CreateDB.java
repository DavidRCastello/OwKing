package database.Tools.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Tools.Model.UserTable;

public class CreateDB {
	
	private static final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
	//private static final String DB_CONNECTION = "jdbc:mysql://localhost/owking";
	private static final String DB_ADDRESS = "127.0.0.1";
	private static final String DB_NAME = "owking";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
	private static final String PORT = "3306";

	
	public CreateDB() {
	
	}
	
	public void createConnection() throws SQLException {
		UserTable userTable = new UserTable();
		String sql = userTable.generateSQLString();
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Establich the connection using the JDBC driver
		
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;


		try {
			 String url = "jdbc:mysql://"+DB_ADDRESS+":"+PORT+"/"+DB_NAME;
			 dbConnection = DriverManager.getConnection(url,DB_USER, null);
			
			 System.out.println("I have connected to the DB");
			//dbConnection = getDBConnection();
			
			 
			preparedStatement = dbConnection.prepareStatement(sql);

			System.out.println(sql);

			// execute create SQL stetement
			preparedStatement.executeUpdate();
//
			System.out.println("Table \"dbuser\" is created!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
			
			
	}
	

}
