package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDatabase {
	
	  public static boolean validate(String username, String password) throws ClassNotFoundException {
	        
		  boolean status = false;

	        try {
	        	
	        	Connection conn = DatabaseConnection.initializeDatabase();

	            // Step 2:Create a statement using connection object
	        	PreparedStatement st = conn.prepareStatement ("select username, password from user where username=? and password=?");
	  
	            st.setString(1, username);
	            st.setString(2, password);

	            ResultSet rs = st.executeQuery();
	            status = rs.next();

	        } catch (SQLException e) {
	            // process sql exception
	            e.printStackTrace();
	        }
	        return status;
	    }
}
