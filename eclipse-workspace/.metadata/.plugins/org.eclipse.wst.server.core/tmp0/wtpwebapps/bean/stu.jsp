<%@ page language="java" %>
<jsp:useBean id="ob" class="mypack.student" />
<jsp:setProperty property="roll" name="ob" value="101"/>
<jsp:setProperty property="name" name="ob" value="Ravan"/>
<jsp:setProperty property="per" name="ob" value="98"/>
<html>
<body>
<h1>
Roll no:<jsp:getProperty property="roll" name="ob"/><br><br>
Student Name :<jsp:getProperty property="name" name="ob"/><br><br>
Roll no:<jsp:getProperty property="per" name="ob"/>
</h1>
</body>
</html>