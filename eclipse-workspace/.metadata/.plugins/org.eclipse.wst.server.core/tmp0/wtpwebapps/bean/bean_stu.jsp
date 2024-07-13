<%@ page language="java" %>
<jsp:useBean id="obj" class="mypack.stud" />
<jsp:setProperty property="*" name="obj"/>
<html>
<body>
<h1>
Roll NO: ${obj.rollno }<br><br>
Name : ${obj.name }<br><br>
Email : ${obj.email }
</h1>
</body>
</html>