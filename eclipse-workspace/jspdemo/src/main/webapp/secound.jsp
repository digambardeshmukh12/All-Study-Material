<%@ page language="java" %>

<html>
<body>
<h1>
<font color="red">
<% 
String un=request.getParameter("t1");
String p =request.getParameter("t2");
if(un.equals("admin") && p.equals("admin123"))
{
	out.println("Welcome,"+un);
	
}

else
{
%>

Sorry,invalid User Name and password
<%
}
%>

</font>
</h1>
</body>
</html>