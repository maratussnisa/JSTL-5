<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>The fmt:parseNumber tag:</h2>  
  
		     <c:set var="data" value="345.8945" />  
		  
		    <fmt:parseNumber var="j" type="number" value="${data}" />  
		    <p><i>Cost of Product is :</i>  <c:out value="${j}" /></p>  
		  
		    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${data}" />  
		    <p><i>Cost of Product is:</i>  <c:out value="${j}" /></p>  


</body>
</html>