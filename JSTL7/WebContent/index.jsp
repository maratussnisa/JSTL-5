<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<br><br><br>
<h1>Employee Salary Details....</h1>
<h2>
		<c:set var="income" scope="session" value="${50000}"/>  
		
	    <br>Your income is : <c:out value="${income}"/><br><br>  
	    
		<c:choose>  
		    <c:when test="${income <= 1000}">  
		       Income is not good.  
		    </c:when>  
		    <c:when test="${income > 40000}">  
		        Income is very good.  
		    </c:when>  
		    <c:otherwise>  
		       Income is undetermined...  
		    </c:otherwise>  
		</c:choose> 
</h2>
</body>
</html>