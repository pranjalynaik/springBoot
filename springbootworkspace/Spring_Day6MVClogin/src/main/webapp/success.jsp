<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome 

${username}<br>
${password}<br>
${intvalue}<br>

<hr>
${stu.name }<br>
${stu.username}<br>
${stu.password }<br>
${stu.email }<br>

<hr>

<table border="2">
<tr>
<th> Name</th>
<th> USERNAME</th>
<th> PASSWORD</th>
<th> EMAIL</th>

</tr>
<c:forEach items="${list}" var="s">
<tr>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td>${s.email}</td>
</tr>

</c:forEach>

</table>
</body>
</html>
