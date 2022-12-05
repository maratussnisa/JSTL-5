package com.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// Initialize the Database
			Connection conn = DatabaseConnection.initializeDatabase();
			
			// Create a SQL query to insert data into demo table
			// Demo table consists of two columns, so two '?' is used
			PreparedStatement st = conn.prepareStatement ("insert into recorddata values(?. ?)");
			
			// For the first parameter
			// Get the data using request object
			// Sets the data to st pointer
			st.setInt(1, Integer.valueOf(request.getParameter("id")));
			
			// Same for second parameter
			st.setString(2, request.getParameter("uname"));
			
			// Execute the insert command using executeUpdate()
			// To make changes in database
			st.close();
			conn.close();
			
			// Get a writer pointer
			// To display the successful result
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully inserted" +
			"</b></body></html>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
