<%@ page language="java" import="java.sql.*" %>
<html>
<body bgcolor="YellowGreen">
<h1>
<%

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
	PreparedStatement pst=con.prepareStatement("insert into account values(?,?,?,?,?)");

	pst.setString(1,request.getParameter("t1"));
	pst.setString(2,request.getParameter("t2"));
	pst.setInt(3,Integer.parseInt(request.getParameter("t3")));
	pst.setString(4,request.getParameter("t4"));
	pst.setInt(5,Integer.parseInt(request.getParameter("t5")));
	
	int i = pst.executeUpdate();
	out.println("Registration Successfully......."+i);
	out.close();
	}

			catch(Exception e){
					out.println(e);
								}
%>
</h1>
</body>
</html>