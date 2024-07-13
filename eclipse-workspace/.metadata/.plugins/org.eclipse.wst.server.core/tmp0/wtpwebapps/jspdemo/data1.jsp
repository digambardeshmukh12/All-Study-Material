<%@ page language="java" import="java.sql.*" %>

<html>
<body bgcolor="cyan">
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
	Statement st=con.createStatement();
	ResultSet rs =st.executeQuery("select * from student");
	out.println("<table cellpadding = '10' border='1'");
	out.println("<tr><th>Id</th><th>Name</th><th>Course</th></tr>");
	while(rs.next())
	{
		%>
		
		
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td></tr>
<% 	
	    
	}
	out.println("</table>");
	rs.close();
	out.close();
}
catch(Exception e)
{
	out.println(e); 
}
%>

</body>
</html>