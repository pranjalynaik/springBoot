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

<table border="2">
<tr>
<th>Rollno</th> 
<th>Name </th>
<th>Username </th>
<th>password </th>
<th>email</th>
<th>Action</th>
</tr>
<c:forEach  items="${data}" var="s"> 
<tr>
<td>${s.rollno}</td>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password} </td>
<td>${s.email} </td>

<td> <a href="edit?rollno= ${s.rollno }">EDIT </a>||<a href="delete?rollno=${s.rollno}">DELETE</a> </td>
</tr>
</c:forEach>
</table>

</body>
</html>