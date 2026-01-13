<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Home Page</h1>
<h3>Welcome: <%= request.getAttribute("name") %></h3>

<input type="button" onClick="location.href='index.jsp'"
value='Log Out'>



</body>
</html>