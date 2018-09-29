package learn_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			
			// Establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "Password1234");
			
			// Create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			// Execute the statement object
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");
			
			// Process the result
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id") + " - "
						+ resultSet.getString("name") + ", "
						+ resultSet.getString("dept") + ", "
						+ resultSet.getInt("salary") + " ");
			}
			
		} catch (SQLException e) {
			System.out.println("Error, in query.");
		}
		
	}
	
}