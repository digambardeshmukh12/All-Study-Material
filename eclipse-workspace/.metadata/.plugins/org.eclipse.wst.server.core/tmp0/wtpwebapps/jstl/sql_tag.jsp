<%@ page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" 
url="jdbc:mysql://Localhost/organization" user="root" password="Bob@123" />

<sql:query dataSource="${db}" var="rs">
select * from student; 
</sql:query>

<table border="2"cellspacing="10" cellspadding="10"  >

<tr>
<th>Id</th>
<th>Name</th>
<th>Marks</th>
</tr>
<c:forEach var="table" items="${rs.rows }" >
<tr>
<td><c:out value="${table.id }"/></td>
<td><c:out value="${table.name }"/></td>
<td><c:out value="${table.marks }"/></td></tr>

</c:forEach>


</table>

</body>
</html>