package com.info2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Getting data from HTML Page
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		String country = request.getParameter("country");
		
		// Create Form Page
		PrintWriter out = response.getWriter();
		
		out.println("<h1>");
		out.println("First Name : "+fname);
		out.println("<br><br>");
		out.println("Last Name : "+lname);
		out.println("<br><br>");
		out.println("Age : "+age);
		out.println("<br><br>");
		out.println("City : "+city);
		out.println("<br><br>");
		out.println("Mobile : "+phone);
		out.println("<br><br>");
		out.println("Country : "+country);
		out.println("<br><br>");
		out.println("</h1>");
	}

}
