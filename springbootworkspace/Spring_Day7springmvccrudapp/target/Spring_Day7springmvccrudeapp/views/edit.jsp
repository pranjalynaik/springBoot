<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit form</title>
</head>
<body>

<form  action="update"> 
<input type= "hidden"  name="rollno" value="${ stu.rollno}">
NAME <input type="text" name="name" value="${stu.name }"><br>
USERNAME  <input type="text" name="username" value="${stu.username }"><br>
PASSWORD  <input type="text" name="password" value="${stu.password }"><br>
EMAIL  <input type="text"  name="email"  value="${stu.email }"><br>

<input type="submit"  value="update"><br>
</form>
    
</body>

</html>