<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<center><h1>Employe Details Are</h1></center>>
${emp.employeId} ${emp.employeName} ${emp.employeAdd} ${emp.gender}  ${emp.fromAdress}  ${emp.toAddress} 

<c:forEach items="${emp.departments}" var="emp">${emp}</c:forEach>
</body>
</html>