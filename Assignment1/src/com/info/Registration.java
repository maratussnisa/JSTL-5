package com.info;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.info.DatabaseConnection;

@MultipartConfig(maxFileSize = 16177215)
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int status = 0;
		Part part = request.getPart("photo");
		String photoFileName = part.getSubmittedFileName();
		
		String uploadPath = "C:/Users/ASUS/Desktop/Java Workspace/Assignment1/WebContent/images/"+photoFileName;
		
		try {
			
			FileOutputStream fos = new FileOutputStream(uploadPath);
			InputStream is = part.getInputStream();
			
			byte[] data=new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			// Initialize the Database
			Connection conn = DatabaseConnection.initializeDatabase();
			
			java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
			
			InputStream is = part.getInputStream();
			
			PreparedStatement st = conn.prepareStatement ("insert into user(name,email,address,phone,city,country,education,photo,date,imageFileName) values(?,?,?,?,?,?,?,?,?,?)");
			
			st.setString(1, request.getParameter("name"));
			st.setString(2, request.getParameter("email"));
			st.setString(3, request.getParameter("address"));
			st.setString(4, request.getParameter("phone"));
			st.setString(5, request.getParameter("city"));
			st.setString(6, request.getParameter("country"));
			st.setString(7, request.getParameter("education"));
			st.setBlob(8, is);
			st.setDate(9, sqlDate);
			
			status = st.executeUpdate();

			st.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
