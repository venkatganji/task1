<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Employees</h3>
    <c:if  test="${!empty feedbacks}">
    <table class="data" border="2">
    <tr>
    	<!-- <th>id</th>-->
        <th>Name</th>
        <th>Email</th>
        <th>reg</th>
        <th>code</th>
        <th>msg</th>
    </tr>
    <c:forEach items="${feedbacks}" var="emp">
        <tr>
        	<!--  <td>${emp.id }</td>-->
            <td>${emp.name} </td>
            <td>${emp.email}</td>
            <td>${emp.reg}</td>
            <td>${emp.code}</td>
            <td>${emp.msg}</td>
            <td><a href="delete/${id}">delete</a></td>
            <td><a href="update/${id}">update</a> </td>
        </tr>
    </c:forEach>
    </table>
    </c:if>

</body>
</html>