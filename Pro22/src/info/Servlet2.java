package info;

import java.io.IOException;
import java.io.PrintWriter;

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

		try {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			// Getting the value from the hidden field string
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String age = request.getParameter("age");
			String city = request.getParameter("city");
			
			// Creating form that hane invisible textfield
			out.print("<br><br><br><h1>Servlet-1<br><br>");
			out.print("<form action='code3'>");
			out.print("<input type='hidden' name='fname' value='"+fname+"'>");
			out.print("<input type='hidden' name='lname' value='"+lname+"'>");
			out.print("<input type='hidden' name='age' value='"+age+"'>");
			out.print("<input type='hidden' name='city' value='"+city+"'>");
			out.print("Phone : <input type='text' name='phone'>");
			out.print("Country : <input type='text' name='country'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();
		} catch (Exception e){System.out.println(e);}
	}

}
