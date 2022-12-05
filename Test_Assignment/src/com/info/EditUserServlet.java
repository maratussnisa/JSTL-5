package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		String education=request.getParameter("education");
		
		User User = new User();
		User.setId(id);
		User.setName(name);
		User.setEmail(email);
		User.setAddress(address);
		User.setPhone(phone);
		User.setCity(city);
		User.setCountry(country);
		User.setEducation(education);
		
		int status = DatabaseConnection.update(User);
		if(status>0)
		{
			response.sendRedirect("/ViewTable");
		}
		else {
			out.println("Sorry! unable to update record");
		}
		
		out.close();
		
	}



}
