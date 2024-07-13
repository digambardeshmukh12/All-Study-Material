package jdbc1;
import java.sql.*;
import java.util.*;
public class prepared3 {

	public static void main(String[] args) {
		
		
		int i , m ;
		String n ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id , Name and Marks");
		
		i = sc.nextInt();
		n = sc.next();
		m = sc.nextInt();
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			
			pst.setInt(1,i);
			pst.setString(2, n);
			pst.setInt(3, m);
			
			pst.executeUpdate();
			con.close();
			System.out.println("Success...");
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
