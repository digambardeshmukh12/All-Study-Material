<%@ page language="java" import="java.sql.*" %>
<jsp:include page="${moduleIncPage}" flush="true" />
<html>
<body>

	<% 
	out.println("<a href = "+"registration.html"+">1. Click Hear for new Registration </a>");
	out.println("<br> <br> <br>");
	out.println("<a href = "+"data.jsp"+">2. Click Hear for Show all Data </a>");
	out.println("<br> <br> <br>");
	out.println("<a href = "+"changpass.html"+">3. Click Hear for Change Password </a>");
	%>



</body>
</html>