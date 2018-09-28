package learn_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		int rowsAffected;
		
		try {
			
			// Establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "****");
			
			// Create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			// Execute the statement object
			rowsAffected = statement.executeUpdate("INSERT INTO employees_tbl (id, name, dept, salary)"
					+ "VALUES (900,'Snake', 'Commando',1500)");
			
			// Process the result
			System.out.println("Executed INSERT statement - Rows affected = " + rowsAffected);
			
		} catch (SQLException e) {
			System.out.println("Error, while insertion.");
		}
		
	}
	
}