<%@ page language="java" %>
<html>
<body>
<h1>
<%
String s1 = (String)session.getAttribute("uname");
String s2 = (String)session.getAttribute("password");
out.println("User name="+s1+"<br>Password="+s2);
out.close();
%>
</h1>
</body>
</html>