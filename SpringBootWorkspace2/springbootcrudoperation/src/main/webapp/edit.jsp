<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">

<pre>

<input type= "hidden" name="rollno" value="${stu.rollno}">

name:<input type="text" name="name"  value="${stu.name}">
username:<input type="text" name="username" value="${stu.username}">
password:<input type="text" name="password" value="${stu.password }">

<input type="submit" value="update">
</pre>
</form>

</body>
</html>