<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<p>Employee Registration Form</p>
	<pre>
		<form action="data" method="post">
			Employee ID    : <input type="text" name="empId">
			Employee Name  : <input type="text" name="empName">
			Employee Gender: <input type="text" name="empGender">
			Employee email : <input type="text" name="empEmail">
			<input type="submit" value="Register">
		</form>
	</pre>
</body>
</html>