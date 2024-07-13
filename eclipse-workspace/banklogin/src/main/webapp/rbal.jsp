<%@ page language="java" import="java.sql.*" %>
<html>
<body bgcolor="SeaGreen">
<h1>
<%

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
	PreparedStatement pst=con.prepareStatement("select bal from account where ano=?");
	pst.setInt(1,Integer.parseInt(request.getParameter("t1")));
	ResultSet rs=pst.executeQuery();
	if(rs.next())
		out.println("your balance is = "+rs.getInt(1));
	else
			out.println("Invalid Account No,Please Enter valid account no");
			rs.close();
			out.close();
			}
catch(Exception e){
	out.println(e);
}
%>
</h1>

</body>
</html>