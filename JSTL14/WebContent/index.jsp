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
<br><br><br>
		<c:set var="data" value="Hi this is micky"/>  
		  
		<c:if test="${fn:contains(data, 'micky')}">  
		   <h2>Micky Mouse</h2>  
		</c:if>  
		  
		<c:if test="${fn:contains(data, 'akira')}">  
		   <h2>Akira Disney</h2>  
		</c:if>  

</body>
</html>