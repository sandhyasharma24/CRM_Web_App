<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Info</title>
<link rel="stylesheet" href="style.css">

</head>
<body>

<h2>Customer List</h2>


<a href="${pageContext.request.contextPath}/getDetail">Register Customer</a>



<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>City</th>
        <th>update</th>
        <th>delete</th>
    </tr>

    <c:forEach var="cust" items="${customerList}">
    <c:url var="updateLink" value="/updateCx">
    	<c:param name="cxId" value="${cust.id}">
    	</c:param>
    </c:url>
    <c:url var="deleteLink" value="/deleteCx">
    <c:param name="cxId" value="${cust.id}" />
	</c:url>
    
        <tr>
            <td>${cust.id}</td>
            <td>${cust.firstName}</td>
            <td>${cust.lastName}</td>
            <td>${cust.city}</td>
            <td><a href="${updateLink }">Update Information</a></td>
            <td><a href="${deleteLink}"
       		onclick="return confirm('Are you sure you want to delete this customer?');">
       			Delete
    			</a>
			</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
