<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enquiry Page</title>
</head>
<body bgcolor="springgreen">
<center>
  <form action="enquiry">
  <b><u>Enquiry Form</u></b><br>
  <br>
 Name:<br>
 <input type="text" name="enqName" id="nm" placeholder="enter name">
  <br><br>
 College:<br>
 <input type="text" name="enqClg" id="clg" placeholder="enter college name">
 <br><br>
 Mobile:<br>
 <input type="number" maxlength="10" id="phn" name="enqMob" placeholder="enter mobile number">
 <br><br>
 Courses:<br>
  <br>
  <input type="checkbox" name="course1" value="Core Java" checked="checked">Core Java
  <input type="checkbox" name="course2" value="Advance Java">Advance Java
  <input type="checkbox" name="course3" value="Python">Python
  <input type="checkbox" name="course4" value="Android">Android
  <input type="checkbox" name="course5" value="PHP">PHP
  <br>
  <p>How do you come to know about Java Technocrat?:</p>
  <select>
  <option value="clg conference">College Conference</option>
  <option value="teacher">Teacher</option>
  <option value="friend">Friend</option>
  <option value="advertisement">Advertisement</option>
  </select><br>
  <input type="submit" value="Add Enquiry">
  </form>
  </center>
</body>
</html>