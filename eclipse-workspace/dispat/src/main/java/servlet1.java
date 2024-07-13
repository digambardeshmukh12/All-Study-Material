

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String un = request.getParameter("t1");
			String p = request.getParameter("t2");
		
			if(un.equals("admin") && p.equals("admin")) {
				out.println("");
				RequestDispatcher rd = request.getRequestDispatcher("servlet2");
				rd.forward(request, response);
				
			}
			
			else {
				RequestDispatcher rd = request.getRequestDispatcher("login1.html");
			    out.println("<h1> sorry invalid user-name and password <h1>");

				rd.include(request, response);
			}
			
			out.close();
	
	
	}

}
