<%@ page language="java" import="java.sql.*"%>
<html>
<body bgcolor="DarkSlateGrey">
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","Bob@123");
	PreparedStatement pst=con.prepareStatement("select * from account where uname=? and password=?");
	pst.setString(1,request.getParameter("t1"));
	pst.setString(2,request.getParameter("t2"));
	ResultSet rs=pst.executeQuery();
	if(rs.next()){
		
		
		%>
		<form action="rbal.jsp" method="post">
		Enter Account No:<input type="text" name="t1"/><br>
		<input type="submit" value="retrive"/>
		</form> 
		
		<% 
		}
	else{
		out.println("Invalid username and password, try again...");
	}
	rs.close();
				out.close();
	}
catch(Exception e){
	out.println(e);
}
%>
</body>
</html>