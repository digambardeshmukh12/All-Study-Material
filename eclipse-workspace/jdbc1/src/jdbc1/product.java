package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class product {

	
	 
	public static void main(String[] args) {
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			PreparedStatement pst = con.prepareStatement("select * from product where product_code < ?");
			pst.setInt(1, 110);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
			
			con.close();
			System.out.println("Success...");
			
				}
			
			
					catch(Exception e ) {
							System.out.println(e);  }

	}

}
