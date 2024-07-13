

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sess1")
public class sess1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
			String un= request.getParameter("t1");
			String p= request.getParameter("t2");
			HttpSession session=request.getSession();
			session.setAttribute("uname",un);
			session.setAttribute("Password",p);
			
			out.println("<h1>data Stored to session..</h1>");
			out.println("<a href='sess2'>Visit next page</a>");
			out.close();
			
	
			
	}

}
