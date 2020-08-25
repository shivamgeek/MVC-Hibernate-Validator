<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
	Kudos for successful Registration - <br>
	<h2 style="color:green">
		${customerData.firstName} ${customerData.lastName} aged ${customerData.age} is a ${customerData.profession}
	</h2>
</h3>

</body>
</html>