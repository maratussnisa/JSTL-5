package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	// Getting request value from form page-3
		
		String uphone = request.getParameter("phone");
		String uemail = request.getParameter("email");
		
		// Creating Http Session Object
		HttpSession session = request.getSession(false);
		
		// Print all values
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<br><br><br><h1>");
		writer.println("User First Name : "+session.getAttribute("firstname"));
		writer.println("<br><br>");
		writer.println("User Last Name : "+session.getAttribute("lastname"));
		writer.println("<br><br>");
		writer.println("User City : "+session.getAttribute("ucity"));
		writer.println("<br><br>");
		writer.println("User Country : "+session.getAttribute("ucountry"));
		writer.println("<br><br>");
		writer.println("User Phone : "+uphone);
		writer.println("<br><br>");
		writer.println("User Email : "+uemail);
		writer.println("<br><br></h1>");
		
	}

}
