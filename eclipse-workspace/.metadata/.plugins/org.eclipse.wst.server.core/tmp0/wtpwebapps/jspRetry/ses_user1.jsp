<%@ page language="java" %>
<html>
<<body>
<%
String s = request.getParameter("t1");
session.setAttribute("uname",s);
out.println("user name storeed in session");

%>

<a href="sess_user2.jsp">Click for next page</a>

</body>
</html>