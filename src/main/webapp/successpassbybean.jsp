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


<jsp:useBean id="user" class="com.skywalker.dto.User" scope="request">

<jsp:setProperty property="userName" name="user" value="NewUser" />
<jsp:setProperty property="age" name="user" value="00" />
<jsp:setProperty property="gender" name="user" value="X" />

</jsp:useBean>

<h3 style="color : red ">Parameter passed using Bean</h3>

<strong>Hello <jsp:getProperty property="userName" name="user"/></strong></strong><br>
Age <jsp:getProperty property="age" name="user"/><br>
Gender <jsp:getProperty property="gender" name="user"/><br>


</body>
</html>