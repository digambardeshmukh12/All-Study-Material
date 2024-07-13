package jdbc1;
import java.sql.*;
public class statementUpdate {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			Statement st = con.createStatement();
//			st.executeUpdate("insert into student values(10,'Ravan',67)");
//			st.executeUpdate("update student set name = 'Raj' , marks = 78 where id = 10");
			st.executeUpdate("delete from student where id = 10");
			con.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
