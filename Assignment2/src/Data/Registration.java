package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Data.DatabaseConnection;

@MultipartConfig(maxFileSize = 16177215)
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
			
			PreparedStatement st = conn.prepareStatement ("insert into user(name,email,username,password,photo,phone) values(?,?,?,?,?,?)");
			
			st.setString(1, request.getParameter("name"));
			st.setString(2, request.getParameter("email"));
			st.setString(3, request.getParameter("username"));
			st.setString(4, request.getParameter("pass1"));
			st.setBlob(5, is);
			st.setString(6, request.getParameter("phone"));
			
			status = st.executeUpdate();

			st.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
