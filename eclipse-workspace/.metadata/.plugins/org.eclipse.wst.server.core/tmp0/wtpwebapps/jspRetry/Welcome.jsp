<%@ page language="java" %>
<html>
<body>
<h1>
<%

String un=request.getParameter("uname");
out.println("welcome,"+un);
out.close();
%>

</h1>
</body>
</html>