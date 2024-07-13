

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginreg")
public class loginreg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String un = ((ServletRequest) request).getParameter("t1");
		String p = ((ServletRequest) request).getParameter("t2");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst = con.prepareStatement("select * from customer where  uid = ? and pass = ?");
			
			pst.setString(1,un);
			pst.setString(2, p);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				out.println("<h1> Login success...... </h1>");
			}
			
			else  {
				out.println("<h1> Login Faild...... </h1>");
			}
			
			rs.close();
			con.close();
			out.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	
	
	}

}
