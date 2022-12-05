package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("teks/html");
		
		PrintWriter writer = response.getWriter();
		
		// Getting Config Object Value
		ServletConfig conf = this.getServletConfig();
		
		String shirt = conf.getInitParameter("Shirt");
		String oil = conf.getInitParameter("Oil");
		String fruits = conf.getInitParameter("Fruits");
		
		// Detting context object value
		ServletContext context = conf.getServletContext();
		String companyname = context.getInitParameter("CompanyName");
		String bankname = context.getInitParameter("Bank");
		
		writer.print("<h1 style='color:green;font-size:35px'>");
		writer.print("----------------------------------------"+"<br>");
		writer.print("Bank Name is : "+bankname+"<br>");
		writer.print("----------------------------------------"+"<br>");
		
		writer.print("Shirt cost is : "+shirt+"<br><br>");
		writer.print("Oil cost is : "+oil+"<br><br>");
		writer.print("Fruits cost is : "+fruits+"<br><br>");
		writer.print("</h1>");
	}

}
