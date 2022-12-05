package Data3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/app1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfig config = null;

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Servlet is Initialized");
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		
		writer.println("<br><br><h1>This is my Second Application</h1>");
		writer.println("<br><br><h1>Servlet--1</h1>");
		
		System.out.println("Do get Method.....");
		
	}

}
