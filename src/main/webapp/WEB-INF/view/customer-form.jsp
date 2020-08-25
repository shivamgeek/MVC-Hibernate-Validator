<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	.myError {color:red}
</style>

</head>
<body>

	<form:form action="processForm" modelAttribute="customerData">
		Enter First Name : <form:input path="firstName" />
		<form:errors path="firstName" cssClass="myError" />
		<br>
		Enter Last Name : <form:input  path="lastName" />
		<form:errors path="lastName" cssClass="myError" /><br>
		<br>
		Enter Age : <form:input  path="age" />
		<form:errors path="age" cssClass="myError" /><br>
		Enter Profession : <form:input  path="profession" />
		<form:errors path="profession" cssClass="myError" /><br>
		<input type="submit" value="Register">
	</form:form>

</body>
</html>