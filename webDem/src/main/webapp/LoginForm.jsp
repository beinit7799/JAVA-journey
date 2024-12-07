<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User login</title>
</head>
<body>
<form action="LoginServlet" method="post">
	<p style="color:red">${message}</p>
	UserName <input type="text"  name="username"> <br><br>
	password<input type="password" name="password"> <br><br>
	 <input type="submit" value="login">
	
</form>
<a href="index.jsp">back</a>

</body>
</html>