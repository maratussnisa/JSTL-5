package com.info;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize=400)
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int status = 0;
		Part part = request.getPart("photo");
		
		try {
			// Initialize the Database
			Connection conn = DatabaseConnection.initializeDatabase();
			
			InputStream is = part.getInputStream();
			
			PreparedStatement st = conn.prepareStatement ("insert into user(name,email,address,phone,city,country,education,photo) values(?,?,?,?,?,?,?,?)");
			
			st.setString(2, request.getParameter("username"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("address"));
			st.setString(5, request.getParameter("phone"));
			st.setString(6, request.getParameter("city"));
			st.setString(7, request.getParameter("country"));
			st.setString(8, request.getParameter("education"));
			st.setBlob(9, is);
			
			status = st.executeUpdate();

			st.close();
			conn.close();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully inserted" + "</b></body></html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
