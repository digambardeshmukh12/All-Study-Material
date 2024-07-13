<%@ page language="java" import="java.sql.*" %>
<jsp:include page="${moduleIncPage}" flush="true" />
<html>
<body bgcolor="cyan">
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
	Statement st=con.createStatement();
	ResultSet rs =st.executeQuery("select * from customer");
	out.println("<table cellpadding = '10' border='1'");
	out.println("<tr><th>User Id</th><th>Custumer ID</th><th>Password</th><th>Custumer Name</th><th>Product Name</th></tr>");
	while(rs.next())
	{
		%>
		
		
<tr><td><%=rs.getString(1)%></td><td><%=rs.getInt(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td></tr>
<% 	
	    
	}
	out.println("</table>");
	out.println("<br> <br> <br>");
	out.println("<a href = "+"Familymain.jsp"+">1. Click Hear for Main Page </a>");
	out.println("<br> <br> <br>");
	
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