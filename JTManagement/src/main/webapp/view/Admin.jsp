<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="springgreen">
<center>
<form action="adminreg" method="post">
<b><u>## Admin Page ##</u></b>
<br><br>
Enter Name:<input type="text" name="name" placeholder="enter your name">
<br><br>
Enter Password:<input type="password" name="password" placeholder="enter your password">
<br><br>
Enter Email:<input type="email" name="email" placeholder="enter your email id">
<br><br>
<input type="submit" value="Submit">
<br><br>
<a href="/login">Login here if already have account</a>
<br>
</form>
</center>
</body>
</html>