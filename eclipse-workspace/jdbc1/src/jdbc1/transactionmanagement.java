package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class transactionmanagement {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			con.setAutoCommit(false);
			int i , m ;
			String n ;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student ID , NAME , MARKS ");
			
			i= sc.nextInt();
			n=sc.next();
			m=sc.nextInt();
			PreparedStatement st = con.prepareStatement("insert into student values (?,?,?)");
			
			con.setAutoCommit(false);
			st.setInt(1, i);
			st.setString(2, n);
			st.setInt(3, m);
			st.executeUpdate();
			System.out.println("If you want to save changes then put yes otherwise put no ");
			String s2 = sc.next();
			if(s2.equals("yes"))
				con.commit();
			else 
				con.rollback();
			
			con.close();
			System.out.println("Done");
			
			
		}
		catch(Exception e ) {
			System.out.println(e);
		}

	}

}
