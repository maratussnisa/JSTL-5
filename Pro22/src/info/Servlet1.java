package info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			
			out.println("Welcome "+firstname);
			out.println("Welcome "+lastname);
			
			// Creating form that hane invisible textfield
			out.print("<br><br><br><h1>Servlet-1<br><br>");
			out.print("<form action='code2'>");
			out.print("<input type='hidden' name='fname' value='"+firstname+"'>");
			out.print("<input type='hidden' name='lname' value='"+lastname+"'>");
			out.print("AGE : <input type='text' name='age'>");
			out.print("City : <input type='text' name='city'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
		} catch (Exception e){System.out.println(e);}
	}

}
