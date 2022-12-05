package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRecords {
	
	// JDBC driver name and database URL
	private static String mydriver;
	private static String DB_URL;
	private static String Db_Name;
	
	// Database Credentials
	private static String USER;
	private static String PASS;
	
	private static String uname;
	private static String carmodel;
	private static String carcolor;
	private static String caryear;
	private static String carcost;
	
	// Constructor
	public DataRecords (String mydriver,  String db_url, String user, String passwd, String dbname,
			String uname, String carmodel, String caryear, String carcolor, String carcost)
	{
		DataRecords.mydriver = mydriver;
		DataRecords.DB_URL = db_url;
		DataRecords.Db_Name = dbname;
		DataRecords.USER = user;
		DataRecords.PASS = passwd;
		DataRecords.uname = uname;
		DataRecords.carmodel = carmodel;
		DataRecords.caryear = caryear;
		DataRecords.carcolor = carcolor;
		DataRecords.carcost = carcost;
	}
	
	public static void records() {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// STEP 3 : Open a connection
			String dbDriver = mydriver;
			String dbURL = DB_URL;
			
			// Database name to access
			
			String dbName = Db_Name;
			String dbUsername = USER;
			String dbPassword = PASS;
			
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
			
			Thread.sleep(2000);
			System.out.println("Database is Connected");
			
			Thread.sleep(2000);
			
			// STEP 4 : Execute a query
			System.out.println("Inserting Records of given table");
			
			stmt = conn.createStatement();
			
			String sql = "insert into carstatus(name, carmodel, caryear, carcolor, carcost) values"
					+ "('"+uname+"','"+carmodel+"', '"+caryear+"', '"+carcolor+"', '"+carcost+"')";
			stmt.executeUpdate(sql);
			
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Record is inserted in table..");

			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection Closed ...");
			
		} catch(SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null)
					stmt.close();
			} catch(SQLException se2) {
			} // nothing we can do
			try {
				if(conn != null)
					conn.close();
			} catch(SQLException se) {
				se.printStackTrace();
			} //end finally try
		} //end try
	}

}
