
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String un = request.getParameter("t1");
		String p = request.getParameter("t2");
		
		if(un.equals("admin") && p.equals("admin123")) {
			out.println("<h1>Login Success...</h1>");
		}
		else
		{
			out.println("<h1>Login Faild...</h1>");
		}
		
		
		
	}

}
