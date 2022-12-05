package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.DataRecords;

/**
 * Servlet implementation class CarPurchase
 */
public class CarPurchase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		// Getting config object value
		ServletConfig conf = this.getServletConfig();
		
		String user = conf.getInitParameter("user");
		String passwd = conf.getInitParameter("password");
		
		// Getting Context object value
		
		ServletContext context = conf.getServletContext();
		String mydriver = context.getInitParameter("mydriver");
		String url = context.getInitParameter("url");
		String dbname = context.getInitParameter("dbname");
		
		// Getting value from HTML Page
		String uname = request.getParameter("uname");
		String carmodel = request.getParameter("carmodel");
		String caryear = request.getParameter("caryear");
		String carcolor = request.getParameter("carcolor");
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		System.out.println(carmodel);
		System.out.println(caryear);
		System.out.println(carcolor);
		
		System.out.println(carmodel.length());
		System.out.println(caryear.length());
		System.out.println(carcolor.length());
		
		System.out.println(carmodel.getClass().getName());
		System.out.println(caryear.getClass().getName());
		System.out.println(carcolor.getClass().getName());
		
		System.out.println("------------------------------------------------");
		System.out.println();
		
		if(carmodel.equals("Honda") &&  caryear.equals("2011")
				&& carcolor.equals("Red"))
		{
			System.out.println("Wrong Selection");
		}
		
		else if (carmodel.equals("BMW") && caryear.equals("2020")
				|| carcolor.equals("Green"))
		{
			System.out.println("Right Track");
			
			String carcost = "45000";
			new DataRecords(mydriver, url, user, passwd, dbname, uname, carmodel, caryear, carcolor, carcost);
			DataRecords.records();
			
			// Get a writer pointer
			// To Display the successful result
			
			PrintWriter out = response.getWriter();
			out.println("<htlm><body><b>Successfully inserted" +
			"</b></body></html>");
		}
		else if (carmodel.equals("Audi") && caryear.equals("2019")
				&& carcolor.equals("Blue"))
		{
				System.out.println("Wrong selection");
		}
		else {
				System.out.println("Something Went Wrong");
		}
		
	}

}
