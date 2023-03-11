<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 </head>
<body>
	<h2>New Product</h2>
	<a href="products">Products</a>
<br><Br>
	<form action="saveproduct" method="post">
		Name : <input type="text" name="name"/><bR><br>
		Price : <input type="text" name="price"><br><br>
		Qty :  <input type="text" name="qty"><br><Br>
		<input type="submit" value="Add Product"/>
	</form><br>
</body>
</html>