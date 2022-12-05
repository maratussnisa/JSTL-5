package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Request is reached");
		
		// Getting value from HTML
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String ecountry = request.getParameter("country");
		String esubject = request.getParameter("subject");
		
		// Creating database class object
		
		new MyDatabaseEntry(firstname, lastname, ecountry, esubject);
		MyDatabaseEntry.MyRecordValue();
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<div style='color:red;font-size:40px;width:800px;height:300px;background-color:powderblue;'>");
		
		writer.println("User first name : "+firstname+"<br>");
		writer.println("User last name : "+lastname+"<br>");
		writer.println("User country name : "+ecountry+"<br>");
		writer.println("User subject name : "+esubject+"<br>");
		
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		
	}

}
