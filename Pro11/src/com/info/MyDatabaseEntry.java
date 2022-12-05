package com.info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyDatabaseEntry {
	// JDBC driver name and database URL
		static final String DB_URL = "jdbc:mysql://localhost:3306/application";
		
		// Database credentials
		static final String USER = "root";
		static final String PASS = "root";

		// global variables
		static String fname;
		static String lname;
		static String country;
		static String subject;
		
		// Constructor
		
		public MyDatabaseEntry(String fname, String lname, String country, String subject)
		{
			MyDatabaseEntry.fname = fname;
			MyDatabaseEntry.lname = lname;
			MyDatabaseEntry.country = country;
			MyDatabaseEntry.subject = subject;
		}
		
		public static void MyRecordValue()
		{
			System.out.println("Query Execution Steps...");
			
			Connection conn = null;
			
			try {
				
			Class.forName("com.mysql.cj.jdbc.Driver");
				// STEP 3 : Open a connection
				System.out.println("Connection to database....");
				
				Thread.sleep(2000);
				System.out.println("Database is Connected");
				
				Thread.sleep(2000);
				
				// STEP 4 : Execute a query
				System.out.println("Inserting Records of given table");
				System.out.println();
				
				// Create SQL statement
				String sql = "INSERT INTO pluto(fname, lname, country, subject)"+"VALUES (?,?,?,?)";
				
				// Create PrepareStatement object
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				// Set auto-commit to false
				conn.setAutoCommit(false);
				
				// Set the variables
				pstmt.setString(1, fname);
				pstmt.setString(2, lname);
				pstmt.setString(3, country);
				pstmt.setString(4, subject);
				
				//Add it to the batch
				pstmt.addBatch();
				
				//Create an int[] to hold return values
				int[] count = pstmt.executeBatch();
				
				//Explicitly commit statements to apply changes
				conn.commit();
				System.out.println();
				
				System.out.println("Total records inserted is : " + count);
				System.out.println("One record is inserted...");
				System.out.println();

				Thread.sleep(2000);
				System.out.println("Data is inserted in table");

				conn.close();
				
				Thread.sleep(2000);
				System.out.println("Connection Closed ...");
				
			} catch(SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// nothing we can do
				try {
					if(conn != null)
						conn.close();
				} catch(SQLException se) {
					se.printStackTrace();
			} //end try
		
			}
			}
		
		public static void main (String[] args) {}

}
