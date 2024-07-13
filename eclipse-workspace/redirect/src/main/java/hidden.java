

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hidden")
public class hidden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String s = request.getParameter("t1");
			out.print("<html> <body> <form action='hidden2'>");
			out.println("<input type='hidden' name='h' value='"+s+"'>");
			out.println("<input type = 'submit' value = 'go' />");
			out.println("</form> </body> </html>");
			out.close();

	}

}
