package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class functioncallable {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
		CallableStatement st = con.prepareCall("{ ? =  call addi(?,?)}");
		
		st.registerOutParameter(1,Types.INTEGER);
		st.setInt(2, 67);
		st.setInt(3, 56);
		st.execute();
		System.out.println("addition  = " + st.getInt(1));
		con.close();
		
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
