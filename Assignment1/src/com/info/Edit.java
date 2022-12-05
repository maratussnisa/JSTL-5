package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Update User</h1>");
        
        String sid=request.getParameter("id");
        int id=Integer.parseInt(sid);
        
        User a = DatabaseConnection.GetUserById(id);
        
        out.print("<form action='/EditServlet' method='post'>");
        out.print("<table>");
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+a.getId()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+a.getName()+"'/></td></tr>");
        out.print("<tr><td>Email:</td><td><input type='text' name='email' value='"+a.getEmail()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='address' value='"+a.getAddress()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='phone' value='"+a.getPhone()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='city' value='"+a.getCity()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='country' value='"+a.getCountry()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='education' value='"+a.getEducation()+"'/></td></tr>");
        
         
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
        out.print("</table>");
        out.print("</form>");
        
        out.close();
	}

}
