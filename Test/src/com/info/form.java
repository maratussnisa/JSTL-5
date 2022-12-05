package com.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int status = 0;
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
     
        String name = request.getParameter("name");
        String city = request.getParameter("city");
         
        try {
         
            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");
             
            //creating connection with the database
            Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/coba","root","root");
 
            PreparedStatement ps = conn.prepareStatement
                        ("insert into user(name,city) values (?,?)");
 
            ps.setString(1, name);
            ps.setString(2, city);
            status = ps.executeUpdate();
             
            ps.close();
			conn.close();
			
			out.println("<html><body><b>Successfully inserted" + "</b></body></html>");
        }
        catch(Exception se) {
            se.printStackTrace();
        }
     
    }

}
