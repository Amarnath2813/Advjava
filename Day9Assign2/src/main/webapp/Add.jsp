<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AddServlet" method="post">
	Enter student name:<input type="text" name="name">
	<br><br>
	Enter student address:<input type="text" name="address">
	<br><br>
	Select persistence store:
	<select name="persistencestore">
	<option value="file">file</option>
	<option value="database">database</option>	
	</select>
	<br><br>
	<input type="submit">



</form>
</body>
</html>