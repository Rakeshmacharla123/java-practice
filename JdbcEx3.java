import java.sql.*;
	public class JdbcEx3 {
	    public static void main(String[] args) {
	        String driver = "oracle.jdbc.OracleDriver";
	        String url = "jdbc:oracle:thin:@localhost:1521:xe:orcl/codes"; // Correct URL format
	        String username = "db1"; // Replace with actual username
	        String password = "pass"; // Replace with actual password

	        try {
	            // Step 1: Register the driver
	            Class.forName(driver);

	            // Step 2: Get the connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            // Step 3: Create statement object
	            Statement stmt = con.createStatement();

	            // Step 4: Execute query
	            stmt.executeUpdate("INSERT INTO codes VALUES (95, 'dubai')");

	            // Step 5: Close the connection
	            con.close();
	            System.out.println("Data inserted successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}