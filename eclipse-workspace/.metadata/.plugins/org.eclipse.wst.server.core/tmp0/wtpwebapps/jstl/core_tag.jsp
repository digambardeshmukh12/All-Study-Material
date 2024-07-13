<%@ page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>
<c:out value="${'Welcome,Lucifer Is here'}"/><br><br>
<c:set var="i" value="10"/>
<c:out value="${i }"/>

<c:forEach var="j" begin="1" end="10" >
<c:out value="${j*4}"></c:out><br><br>

</c:forEach>


</h1>
</body>
</html>