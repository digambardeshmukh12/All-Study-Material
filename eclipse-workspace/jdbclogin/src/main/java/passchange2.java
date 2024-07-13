

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/passchange2")
public class passchange2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String un = request.getParameter("t1");
		String p = request.getParameter("t2");
		String newp = request.getParameter("t3");
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst = con.prepareStatement("update customer set pass = ? where uid=? and pass=? ");
			
			pst.setString(1,newp);
			pst.setString(2, un); 
			pst.setString(3, p); 
			int i = pst.executeUpdate();
			out.println("<h1 style='background-color:cyan;'><i> Password update successfuly...</i> </h1>");
			out.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
