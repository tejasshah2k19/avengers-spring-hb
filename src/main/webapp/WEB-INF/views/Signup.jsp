<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<form action="saveuser" method="post">
		FirstName : <input type="text" name="firstName" /><br>
		<br> LastName : <input type="text" name="lastName" /><br>
		<br> 
		
		Email : <input type="text" name="email" /><br>
		<br>
		Password : <input type="text" name="password" /><br>
		<br>
		
		<input type="submit" value="Register"/>

	</form>

</body>
</html>