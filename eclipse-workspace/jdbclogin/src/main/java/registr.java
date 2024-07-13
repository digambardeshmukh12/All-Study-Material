

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registr")
public class registr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uid  = request.getParameter("t1");
		String p = request.getParameter("t2");
		int cid = Integer.parseInt(request.getParameter("t3"));
		String cname  = request.getParameter("t4");
		String pname  = request.getParameter("t5");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst1 = con.prepareStatement("select * from customer where cid = ?");
			pst1.setInt(1,cid);
			ResultSet rs = pst1.executeQuery();
			
			if(rs.next()) {
				out.println("<h1>This Customer Id already exist,"
						+ " Plese use another customer Id ");
			}
			
			else {
				PreparedStatement pst2 = con.prepareStatement("insert into customer values (?,?,?,?,?)");
				pst2.setString(1,uid);
				pst2.setInt(2,cid);
				pst2.setString(3,p);
				
				pst2.setString(4,cname);
				pst2.setString(5,pname);
				int i = pst2.executeUpdate();
				out.println("<h1>Customer Registration successfully...... "+i+"</h1>");

			}

			rs.close();
		}
		catch(Exception e ) {
			out.println(e);
		}
		
		out.close();
	
	}

}
