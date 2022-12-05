package com.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
		
		// Initialize all the information regarding
		// Database Connection
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/";
		
		// Database name to access
		String dbName = "registration";
		String dbUsername = "root";
		String dbPassword = "root";
		
		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
		
		return con;
	}
	
	public static List<User> getAllUser()
	{
		List<User> list = new ArrayList<User>();
		
		try
		{
			Connection conn = DatabaseConnection.initializeDatabase();
			PreparedStatement st = conn.prepareStatement ("select id,name,date,city from user");
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setDate(rs.getDate(3));
				u.setCity(rs.getString(4));
				list.add(u);	
		}
		conn.close();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
		return list;
	}
	
	public static int delete(int id)
	{
		int result = 0;
		try
		{
			Connection conn = DatabaseConnection.initializeDatabase();
			PreparedStatement st = conn.prepareStatement ("delete from user where id=?");
			st.setInt(1, id);
			result = st.executeUpdate();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static User GetUserById(int id)
	{
		User u = new User();
		
		try
		{
			Connection conn = DatabaseConnection.initializeDatabase();
			PreparedStatement st = conn.prepareStatement ("select id,name,email,address,phone,city,country,education from user where id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setAddress(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setCity(rs.getString(6));
				u.setCountry(rs.getString(7));
				u.setEducation(rs.getString(8));
			}
			conn.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return u;
	}
	
	public static int update (User user)
	{
		int status = 0;
		
	try
	{
		Connection conn = DatabaseConnection.initializeDatabase();
		
		PreparedStatement st = conn.prepareStatement("update user set name=?,email=?,address=?,phone=?,city=?,country=?,education=? where id=?");
		st.setString(1, user.getName());
		st.setString(2, user.getEmail());
		st.setString(3, user.getAddress());
		st.setString(4, user.getPhone());
		st.setString(5, user.getCity());
		st.setString(6, user.getCountry());
		st.setString(7, user.getEducation());
		st.setInt(8, user.getId());
		
		status = st.executeUpdate();
				
		conn.close();
	}
	catch (Exception ex)
	{
		ex.printStackTrace();
	}
	
	return status;
	}

}
