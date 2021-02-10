<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temperature Conversion</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<form action="getFtoCServlet" method="post">
	Enter the temperature in Fahrenheit to convert it to Celsius: 
	<input type = "text" name = "userDegreesFahrenheit" size="10">
	<input type = "submit" value = "Convert to Celsius" /></form>
	<h2>OR</h2>
	<form action="getCtoFServlet" method="post">
	Enter the temperature in Celsius to convert it to Fahrenheit: 
	<input type = "text" name = "userDegreesCelsius" size="10">
	<input type = "submit" value = "Convert to Fahrenheit" /></form>
</body>
</html>