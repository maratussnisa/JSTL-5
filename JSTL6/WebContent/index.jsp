<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<br><br>
<h1>Employee Salary Data : </h1>
<h2>
    <c:set var="data" scope="session" value="${50000*5}"/>  
    
	<c:if test="${data > 8000}">  
	   <p>My income is: <c:out value="${data}"/><p>  
	</c:if> 
	
	
</h2>
</body>
</html>