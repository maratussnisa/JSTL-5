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
<h1>JSTL fn:trim()</h1>
<br><br>

		<c:set var="str1" value="Welcome to ATS        Java programming Classes        "/>  
		<p>String-1 Length is : ${fn:length(str1)}</p>  
		  
		<c:set var="str2" value="${fn:trim(str1)}" />  
		<p>String-2 Length is : ${fn:length(str2)}</p>  
		<p>Final value of string is : ${str2}</p>  


<br><br>
</body>
</html>