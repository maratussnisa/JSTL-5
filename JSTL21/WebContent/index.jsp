<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<h1>JSTL fn:split()</h1>
<br><br>

		<c:set var="data1" value="Hi-this-is-java-Jstl-programming-section-by-ATS."/>  
		<c:set var="data2" value="${fn:split(data1, '-')}" /> 		
		<c:set var="data3" value="${fn:join(data2, ' ')}" />  
		<p>Data-3 : ${data3}</p>
		
		<br>
		
		<c:set var="data4" value="Hi this is java Jstl programming section by ATS."/>  
		<c:set var="data5" value="${fn:split(data4, ' ')}" />  
		<c:set var="data6" value="${fn:join(data5, '/')}" />  
		  
		<p>Data-6 : ${data6}</p>  

<br><br>
</body>
</html>