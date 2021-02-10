<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results: to Fahrenheit</title>
</head>
<body>
	<p>${userDegreesToF.getDegreesEntered()} degrees Celsius is equivalent to 
		${userDegreesToF.getDegreesFahrenheit()} degrees Fahrenheit. </p>
	<a href = "index.jsp">Enter another temperature to convert</a>
</body>
</html>