<%@ page language="java" import= "java.util.*" %>

<html>
<body bgcolor="lightblue">
<h1>
<%! int a=4; %>

<%
out.println("today date and time="+ Calendar.getInstance().getTime());
%>
<br>
<% 
out.println("square="+(a*a));
%>
<br>
<font color="red">
<%=a %>
</font>
</h1>

</body>
</html>