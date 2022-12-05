package com.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting request value from form page-2
		
		String ucity = request.getParameter("city");
		String ucountry = request.getParameter("country");
		
		// Creating Http Session Object
		HttpSession session = request.getSession(false);
		
		// Set data into session object
		session.setAttribute("ucity", ucity);
		session.setAttribute("ucountry", ucountry);
		
		// Forward request to formpage-3
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formpage3.html");
		dispatcher.forward(request, response);
	}

}
