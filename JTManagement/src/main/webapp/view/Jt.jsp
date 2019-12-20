<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="sandybrown">

<center>
<h2>Welcome JTian</h2>
<form action="jtb" method="post">
Enter Your Name:<input type="text" name="name">
<br>
Select your Batch:
<select>
<option value="core java">Core Java</option>
<option value="core java1">Core Java + Internship</option>
<option value="adv java">Advance Java</option>
<option value="adv java1">Advance Java + Internship</option>
</select>
<br>
Books:
<select>
<option value="core Java">Core Java</option>
<option value="advance Java">Advance Java</option>
<option value="datastructure">DataStructure</option>
<option value="python">Python</option>
</select>
<br>
<input type="submit" value="Submit">
</form>
</center>
</body>
</html>