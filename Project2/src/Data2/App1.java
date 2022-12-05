package Data2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App1
 */
public class App1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		this.config = config;
		System.out.println("Servlet is Initialized");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Servlet is Destroyed");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		
		writer.println("<br><br><h1>This is my First Application</h1>");
		
		System.out.println("Do get Method.....");
	}

}
