package info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendErrorMech
 */
public class SendErrorMech extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String uname = request.getParameter("uname");
		
		if(id.equals("101") && uname.equals("micky"))
		{
			response.sendRedirect("loginsuccess.html");
		} else
		{
			response.sendError (5050,"Oooooooops! user name is not correct plz check once again");
		}
	}

}
