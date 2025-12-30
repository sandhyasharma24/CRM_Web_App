<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
</head>
<body>

<h2>Update Customer Data</h2>

<form:form action="${pageContext.request.contextPath}/updateCx"
           method="post"
           modelAttribute="customer"
           class="form-box">

    <label>First Name</label>
    <form:input path="firstName" required="true"/>

    <label>Last Name</label>
    <form:input path="lastName" required="true"/>

    <label>City</label>
    <form:input path="city" required="true"/>

    <!-- VERY IMPORTANT: ID must be preserved -->
    <form:hidden path="id"/>

    <button type="submit">Update</button>

</form:form>

<a href="${pageContext.request.contextPath}/CustomerInfo">⬅ Back to List</a>

</body>
</html>
