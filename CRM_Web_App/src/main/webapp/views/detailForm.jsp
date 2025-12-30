<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<h2>Add Customer</h2>

<form action="${pageContext.request.contextPath}/regCx" method="post" class="form-box">

    <label>First Name</label>
    <input type="text" name="firstName" required>

    <label>Last Name</label>
    <input type="text" name="lastName" required>

    <label>City</label>
    <input type="text" name="city" required>

    <button type="submit">Save</button>

</form>

<a href="${pageContext.request.contextPath}/CustomerInfo">⬅ Back to List</a>


</body>
</html>
