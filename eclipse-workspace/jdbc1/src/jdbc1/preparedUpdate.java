package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedUpdate {

	public static void main(String[] args) {
		
		
		int i , m ;
		String n ;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter student   Name and Marks");
		
		n = sc.next();
		m = sc.nextInt();
		System.out.println("Enter student id ");
		i = sc.nextInt();
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst = con.prepareStatement("update student set name = ?,marks = ? where id = ?");
			
			
			pst.setString(1,n);
			pst.setInt(2, m);
			pst.setInt(3,i);
			
			pst.executeUpdate();
			con.close();
			System.out.println("Success...");
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
