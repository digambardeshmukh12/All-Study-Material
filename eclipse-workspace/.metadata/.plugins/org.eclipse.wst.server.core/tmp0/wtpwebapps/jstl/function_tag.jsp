<%@ page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<html>
<body>

<h1>
Length of "hello":${fn:length("hello") }<br><br>

In lower case: ${fn:toLowerCase("RAVAN")}<br><br>
In Upper case: ${fn:toUpperCase("ravan")}<br><br>
<c:set var="s" value="${'ravan'}" />
In Upper case: ${fn:toUpperCase(s)}<br><br>


</h1>
</body>
</html>