package database.Tools.Main;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.Tools.Helpers.CreateDB;

public class main {
	
		
		public static void main(String[] argv) {

			try {

				CreateDB createDB = new CreateDB();
				createDB.createConnection();

			} catch (SQLException e) {

				System.out.println(e.getMessage());

			}

		}

		
	}

