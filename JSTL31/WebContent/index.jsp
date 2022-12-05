<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3>Formatting of Number:</h3>  
<c:set var="Amount" value="78.456789" />  
<p> Formatted Number-1: &nbsp;&nbsp; 
<fmt:formatNumber value="${Amount}" type="currency" /></p><br>  
<p>Formatted Number-2:  &nbsp;&nbsp;
<fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /></p><br>  
<p>Formatted Number-3:  &nbsp;&nbsp;
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p><br>  
<p>Formatted Number-4:  &nbsp;&nbsp;
<fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p><br>  
<p>Formatted Number-5:  &nbsp;&nbsp;
<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /></p><br>  
<p>Formatted Number-6:  &nbsp;&nbsp;
<fmt:formatNumber type="number" pattern="##.###$" value="${Amount}" /></p><br> 


</body>
</html>