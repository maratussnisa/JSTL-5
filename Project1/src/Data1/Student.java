package Data1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Student class is executed");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		//getting value from html file
		writer.println("<br><br><br><br><h1 style='color:green;font-size:50px;'>Employee class data is Executed......</h1>");
	}

}
