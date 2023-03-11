<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<h2>List Products</h2>
	<table border="1">
		<tr>
			<th>ProductID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Qty</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.productId }</td>
				<td>${p.name }</td>
				<td>${p.price }</td>
				<td>${p.qty }</td>
				<td><a href="deleteproduct/${p.productId }">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>