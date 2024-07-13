package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedDelete {

	public static void main(String[] args) {
		
		
		int i;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id ");
		
		i = sc.nextInt();
	
		
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst = con.prepareStatement("delete from student where id = ?");
			
			pst.setInt(1,i);
			
			
			pst.executeUpdate();
			con.close();
			System.out.println("Success...");
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		

	}

}
