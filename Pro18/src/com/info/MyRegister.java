package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyRegister
 */
public class MyRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting request from Browser Page...
		String username = request.getParameter("uname");
		System.out.println("Value is : "+username);
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(username.equals("micky"))
		{
			System.out.println("Request is reached...");
			RequestDispatcher dispatcher = request.getRequestDispatcher("./myservlerresult");
			dispatcher.forward(request, response);
		}
		else {
			writer.println("<h2 style='color:red;'>Oops ! Login Failed. Give Valid Information of User Name....</h2>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
	}

}
