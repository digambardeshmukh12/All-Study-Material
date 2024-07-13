package jdbc1;

import java.sql.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class metadata_resultset {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from student");
			
			ResultSetMetaData rm = (ResultSetMetaData) rs.getMetaData();
			
			System.out.println("Total column " + rm.getColumnCount());
			System.out.println("mane of  column 2 " + rm.getColumnName(2));
			System.out.println("Data type of column 2 " + rm.getColumnTypeName(2));
			
		}
		catch(Exception e ) {
			System.out.println(e);
		}

	}

}
