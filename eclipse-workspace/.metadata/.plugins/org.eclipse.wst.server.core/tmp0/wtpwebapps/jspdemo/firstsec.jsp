<%@ page language="java" %>
<html>
<body>
<h1>
<%
String un=request.getParameter("t1");
String p=request.getParameter("t2");
session.setAttribute("uname",un);
session.setAttribute("password",p);
out.println("data stored in session");

%>
<a href="secoundsec.jsp">Visit next page</a>

</h1>
</body>
</html>