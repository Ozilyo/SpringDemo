<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
</head>
<body>

	<h1 align="center">Interface Co. Ltd.</h1>
	
	<h2 align="center">Welcome to the Employee Management System</h2>
	
	<h3 align="center">${welcomeMessage}</h3>

	<br><br>

	<a href="employees">Manage Employees</a>
	<br>
	<a href="/departments">Manage Departments</a>
</body>
</html>