<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Student</title>
</head>
<body>
    <form action="secondJSP.jsp" method="get">
        <label for="roll">Roll :</label>
        <input type="text" id="roll" name="roll"><br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address"><br><br>

        <label for="college">College:</label>
        <input type="text" id="college" name="college"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
