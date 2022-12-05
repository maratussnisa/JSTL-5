package Data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginProcess
 */
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
        
        try {
            if (LoginDatabase.validate(username,password)) {
                HttpSession session = request.getSession();
                session.setAttribute("username",username);
                RequestDispatcher rs = request.getRequestDispatcher("dashboard.jsp");
                rs.forward(request, response);
                // response.sendRedirect("");
            } else {
                out.print("Username or Password incorrect");
                //response.sendRedirect("");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	

}
