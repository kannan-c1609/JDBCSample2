import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	   static final String DB_URL = "jdbc:mysql://localhost:3306/virtusa_batch2";
	   static final String USER = "root";
	   static final String PASS = "root@123";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open a connection
		
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);		  
	         Statement stmt = conn.createStatement();
	      ) {
	    	 // Create Table 
	    	  String sql = "CREATE TABLE REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	    	  
	         // Execute a query	    	  
//	         System.out.println("Inserting records into the table...");          
//	         sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
//	         stmt.executeUpdate(sql);
//	         
//	         System.out.println("Inserted records into the table...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
		
	}

}
