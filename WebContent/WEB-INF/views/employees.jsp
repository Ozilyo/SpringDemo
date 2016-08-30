<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th width="80">ID</th>
			<th width="120">First Name</th>
			<th width="120">Last Name</th>
			<th width="120">Salary</th>
			<th width="120">Department</th>
		</tr>
		<c:forEach items="${employeesList}" var="employee" >
			<tr>
				<td align="center">${employee.getEmpId()}</td>
				<td align="center">${employee.getFirstName()}</td>
				<td align="center">${employee.getLastName()}</td>
				<td align="center">${employee.getSalary()}</td>
				<td align="center">${employee.getDepartment().getDepartmentName()}</td>
				
				<td align="center"><a
					href="<c:url value='/employees/edit/${employee.getEmpId()}'/>">Edit</a></td>
				<td align="center"><a
					href="<c:url value='/employees/delete/${employee.getEmpId()}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- ############################################### -->
	<br> <br>
	<form:form modelAttribute="employee">
		<table>
			<tr>
				<td><form:label path="empId">
						<spring:message text="ID"/>
					</form:label></td>
				<td><form:input path="empId" readonly="true" size="12" disabled="true"/>
					 <form:hidden path="empId"/></td>
			</tr>
			<tr>
				<td><form:label path="firstName" cssErrorClass="error">
						<spring:message text="First Name"/>
					</form:label></td>
				<td><form:input path="firstName" required="true" cssErrorClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="lastName" required="true" cssErrorClass="error"
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>