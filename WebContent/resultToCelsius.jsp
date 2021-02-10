<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results: to Celsius</title>
</head>
<body>
	<p>${userDegreesToC.getDegreesEntered()} degrees Fahrenheit is equivalent to 
		${userDegreesToC.getDegreesCelsius()} degrees Celsius. </p>
	<a href = "index.jsp">Enter another temperature to convert</a>
</body>
</html>