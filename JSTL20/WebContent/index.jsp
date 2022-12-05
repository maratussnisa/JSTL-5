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
<h1>JSTL fn:startsWith()</h1>
<br><br>

<h2>
		<c:set var="data1" value="Hi this is micky from ATS India"/>  
		The string starts with "Hi": ${fn:startsWith(data1, 'Hi')}  
		<br>The string starts with "micky": ${fn:startsWith(data1, 'micky')}  
</h2>

<br><br>
</body>
</html>