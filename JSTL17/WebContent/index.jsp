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
<h1>JSTL fn:escapeXml()</h1>
<br><br>

		<c:set var="data1" value="Hi this is micky mouse."/> 
		<c:set var="data2" value="Hi this <xyz>is Akira from ATS.</xyz>"/>   
		  
		<p>With escapeXml() Function:</p>  
		<p>string-1 : ${fn:escapeXml(data1)}</p>  
		<p>string-2 : ${fn:escapeXml(data2)}</p>  
		
		<br><br>
		
		<p>Without escapeXml() Function:</p>  
		<p>string-1 : ${data1}</p>  
		<p>string-2 : ${data2}</p>  

<br><br><br><br>
<br><br><br><br>
</body>
</html>