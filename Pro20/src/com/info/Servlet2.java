package com.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting request value from form page-1
		
		String ucity = request.getParameter("city");
		String ucountry = request.getParameter("country");
		
		// Prepare Cookie
		Cookie cookie3 = new Cookie ("ucity", ucity);
		Cookie cookie4 = new Cookie ("ucountry", ucountry);
		
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		// Forward request to formpage-2
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formpage3.html");
		dispatcher.forward(request, response);
	}
}
