<%@ page language="java" %>
<html>
<body>
<h1>
<% 
String a = request.getParameter("t1");
String b = request.getParameter("t2");
if(a.equals("admin") && b.equals("admin"))
{
	
%>
<jsp:forward page="Welcome.jsp">
<jsp:param value="<%=a%>" name="uname" />
</jsp:forward>
<%
}
else
{
	
	%>
	
	sorry, Incorrect user or password,try again..
	<jsp:include page="Login.html"></jsp:include>
	
	<% 
}
out.close();
%>

</h1>
</body>
</html>