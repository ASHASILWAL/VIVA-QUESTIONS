<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Records</title>
</head>
<body>
    <h2>Student Records : </h2>
    <p>Roll : <%= request.getParameter("roll") %></p>
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Address: <%= request.getParameter("address") %></p>
    <p>College: <%= request.getParameter("college") %></p>
</body>
</html>