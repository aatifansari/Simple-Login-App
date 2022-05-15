<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.skywalker.dto.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>

<h2>Login Successful</h2>


<%
User user = (User) request.getAttribute("user");
%> 


<strong>Hello <%=user.getUserName() %> !!!</strong></strong><br>
Age  <%=user.getAge() %><br>
Gender <%=user.getGender() %><br>


</body>
</html>