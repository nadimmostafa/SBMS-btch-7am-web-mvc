<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
	<h2>Employees List</h2>
	<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Email</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.empId}</td>
				<td>${item.empName}</td>
				<td>${item.empMail}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>