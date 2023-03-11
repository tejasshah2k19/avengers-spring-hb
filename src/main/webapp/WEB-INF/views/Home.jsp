<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Welcome ${emp.name}</h2>

	<c:if test="${emp.address == null }">

		<form method="post" action="saveaddress">
			AddressLine : <input type="text" name="addressLine"><br>
			<br> City : <input type="text" name="city" /><br> <br>
			<input type="submit" value="Save Address" />
		</form>
	</c:if>
	<br>
	<br> Address : ${emp.address.addressLine }
</body>
</html>