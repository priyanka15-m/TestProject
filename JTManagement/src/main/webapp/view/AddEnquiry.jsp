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
  <form action="addenquiry" method="post">
  <b><u>Enquiry Form</u></b><br>
  <br>
 Name:<input type="text" name="student_name">
  <br><br>
 Email:<input type="email" name="email">
 <br><br>
 Mobile:<input type="number" maxlength="10" name="mobile">
 <br><br>
 Course:
  <input type="checkbox" name="subject" value="Core Java" checked="checked">Core Java
  <input type="checkbox" name="subject" value="Advance Java">Advance Java
  <input type="checkbox" name="subject" value="Python">Python
  <input type="checkbox" name="subject" value="Android">Android
  <input type="checkbox" name="subject" value="PHP">PHP
  <br><br>
  Advertising Agent:
  <select name="advertising_agent">
  <option value="clg_conference" >College Conference</option>
  <option value="teacher" >Teacher</option>
  <option value="friend" >Friend</option>
  <option value="advertisement" >Advertisement</option>
  </select><br><br>
  College:<input type="text" name="college">
  <br><br>
  <input type="submit" value="Submit">
  </form>
  </center>
</body>
</html>