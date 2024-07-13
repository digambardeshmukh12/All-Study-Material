

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/httpsessionaccescount")
public class httpsessionaccescount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("taxt/html");
		HttpSession session = request.getSession();
		Integer ob =(Integer)session.getAttribute("count");
		if(ob==null)
			ob=1;
		else {
			ob=ob=1;
		}
	
		session.setAttribute("count", ob);
		out.println("<h1>You have accessed this web page&nbps;"+ob+"times</h1>");
		out.close();
	}

}
