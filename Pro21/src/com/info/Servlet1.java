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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			
			String username = firstname+" "+lastname;
			
			out.print("Welcome "+firstname+" : ");
			
			// Appending the username in the query string
			
			out.print("<a href='code2?username="+username+"'> visit</a>");
			
			out.close();
		} catch (Exception e){System.out.println(e);}
	}

}
