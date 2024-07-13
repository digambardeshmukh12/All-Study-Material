<%@ page language="java" %>
<jsp:useBean id="obj" class="mypack.employee"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<html>
<body>
<h1>
Employee Id:<jsp:getProperty property="id" name="obj"/><br><br>
Employee Name:<jsp:getProperty property="name" name="obj"/><br><br>
Employee Address :<jsp:getProperty property="address" name="obj"/>
</h1>
</body>
</html>