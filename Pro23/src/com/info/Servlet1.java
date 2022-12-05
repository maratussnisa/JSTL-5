package com.info;

import java.io.IOException;
import java.io.PrintWriter;

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
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("status.html").include(request, response);
		
		String name= request.getParameter("uname");
		String password = request.getParameter("password");
		
		if(name.equals("micky") && password.equals("ats123")) {
			out.print("<h2 style='color:red;'>Welcome "+name+"</h2>");
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
		} else {
			out.print("<h1 style='color:red;'>Sorry, username or password error!</h1>");
			
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

}
