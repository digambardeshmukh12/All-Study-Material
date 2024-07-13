package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class procedurecalleble {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			CallableStatement cst = con.prepareCall("{call ins(?,?,?)}");
			
			cst.setInt(1, 37);
			cst.setString(2,"Neha");
			cst.setInt(3, 78);
			
			cst.execute();
			con.close();

			System.out.println("Success");
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
