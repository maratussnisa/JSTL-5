package com.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
        printWriter.println("<h1>User List</h1>");
        
        List<User> list = DatabaseConnection.getAllUser();
        printWriter.print("<table border='1' bordercolor='#009879' width='50%'");
        printWriter.print("<tr><th>Sno</th><th>Name</th><th>City</th><th>Status</th><th>Operation</th></tr>");
        for(User u :list) {
        	printWriter.print("<tr><td>"+u.getId()+"</td><td>"+u.getName()+"</td><td>"+"</td><td>"+u.getCity()+"</td><td>Click Here </td><td>"+"</td><td><a href='EditServlet?id="+u.getId()+"'>Edit</a><a href='DeleteServlet?id="+u.getId()+"'>Delete</a></td>");
        }
        printWriter.print("</table>");
        
        printWriter.close();
	}

	

}
