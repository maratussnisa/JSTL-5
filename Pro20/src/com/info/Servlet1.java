package com.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
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
		
		// Prepare Cookie
		Cookie cookie1 = new Cookie ("firstname", firstname);
		Cookie cookie2 = new Cookie ("lastname", lastname);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		// Forward request to formpage-2
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formpage2.html");
		dispatcher.forward(request, response);
	}

}
