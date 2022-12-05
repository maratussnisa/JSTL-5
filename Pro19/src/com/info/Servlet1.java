package com.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting request value from form page-1
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		
		// Creating Http Session Object
		HttpSession session = request.getSession();
		
		// Set data into session object
		session.setAttribute("firstname", firstname);
		session.setAttribute("lastname", lastname);
		
		// Forward request to formpage-2
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formpage2.html");
		dispatcher.forward(request, response);
	}

}
