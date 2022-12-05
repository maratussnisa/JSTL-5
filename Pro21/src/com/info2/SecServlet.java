package com.info2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecServlet
 */
public class SecServlet extends HttpServlet {
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
		
		// Create Form Page
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<br><br>");
		out.println("<br><br>");
		out.println("<br><br>");
		out.println("<h1>Servlet2</h1>");
		out.println("<br><br>");
		out.println("<form action='./data3?fname="+fname+"&lname+"+lname+"&age="+age+"&city="+city+"' method='post'>");
		out.println("Phone :<input type='text' name='phone'>");
		out.println("<br><br>");
		out.println("Country :<input type='text' name='country'>");
		out.println("<br><br>");
		out.println("City :<input type='submit' value='Next'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
