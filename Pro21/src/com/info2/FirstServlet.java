package com.info2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting data from HTML Page
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		
		// Create Form Page
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<br><br>");
		out.println("<br><br>");
		out.println("<br><br>");
		out.println("<h1>Servlet1</h1>");
		out.println("<br><br>");
		out.println("<form action='./data2?fname="+fname+"&lname+"+lname+"' method='post'>");
		out.println("Age :<input type='text' name='age'>");
		out.println("<br><br>");
		out.println("City :<input type='text' name='city'>");
		out.println("<br><br>");
		out.println("City :<input type='submit' value='Next'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
