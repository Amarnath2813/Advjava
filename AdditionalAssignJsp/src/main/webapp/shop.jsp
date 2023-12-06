<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="SecondServ" method="post">
<c:forEach var="productname" items="${mylist}">
	<input type=checkbox name=selectedproductname value=${productname}>${productname}
	<br>
</c:forEach>
<input type=submit name ="custom" value="addtocart">
</form>
</body>
</html>
