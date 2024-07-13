<%@ page language="java" %>

<jsp:useBean id="obj" class="mypack.demo"/> 
<html>
<body>
<h1>

<%=obj.square(3) %>
</h1>

<font color="red">
<%
out.println("cube="+obj.cube(4));

%>

</font>
</body>
</html>