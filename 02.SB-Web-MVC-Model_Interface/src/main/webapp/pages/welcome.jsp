<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelcomePage</title>
</head>
<body>
	<h1>${message}</h1>
	<pre>
		<h2>Employee ID   : ${emp.empId}</h2>
		<h2>Employee Name : ${emp.empName}</h2>
		<h2>Employee Email: ${emp.empMail}</h2>
	</pre>
</body>
</html>