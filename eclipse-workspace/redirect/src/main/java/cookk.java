

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookk")
public class cookk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String pname = request.getParameter("t1");
		String prate = request.getParameter("t2");
		
		Cookie c1 = new Cookie("name",pname);
		Cookie c2 = new Cookie("rate",prate);
		response.addCookie(c1);
		response.addCookie(c2);
		out.println("<h1>value stored in cookie</h1>");
		out.println("<a href='cookk2'>Next Page to view cookie data </a>");
		out.close();
		
	
		
	}

}
