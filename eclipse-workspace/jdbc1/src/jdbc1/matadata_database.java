package jdbc1;

import java.sql.*;


public class matadata_database {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
			DatabaseMetaData dm = con.getMetaData();
			
			System.out.println("JAR File name " + dm.getDriverName());
			System.out.println("Version of mysql " + dm.getDriverVersion());
			System.out.println("database product name  " + dm.getDatabaseProductName());
			System.out.println("database product version " + dm.getDatabaseProductVersion());
			System.out.println(dm.getUserName());
			
			String tb[] = {"TABLE"};
			
			ResultSet rs = dm.getTables(null, null, null, tb);
			
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
			rs.close();
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
