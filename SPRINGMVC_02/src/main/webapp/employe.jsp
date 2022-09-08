<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<center><h1 style="color: skyblue">Employee Details</h1></center>
<body>
<center>
<form:form action="insert" modelAttribute="emp">
Employe Id:<form:input  path="employeId"/><br>
Employe Name:<form:input  path="employeName"/><br>
Employe Addres:<form:input path="employeAdd"/><br>
Employe gender:<form:radiobutton path="gender" value="male"/>Male
           <form:radiobutton path="gender" value="Female"/>Female
           <br>
Employefrom:<form:select path="fromAdress">
<form:option value="--default--"></form:option>
<form:option value="Hyderbad"></form:option>
<form:option value="Warangal"></form:option>
<form:option value="Karimnagar"></form:option>
</form:select>
<br>
EmployeToAddres:<form:select path="toAddress">
<form:option value="Delhi"></form:option>
<form:option value="Mumbai"></form:option>
<form:option value="Gujarat"></form:option>
</form:select>
<br>
Employe Departments:

Software:<form:checkbox path="departments" value="Software"/>
Testing:<form:checkbox path="departments" value="Testing"/>
FrontEnd:<form:checkbox path="departments" value="FrontEnd"/>
<br>

<input type="submit" value="save">
</center>


</form:form>
</body>
</html>