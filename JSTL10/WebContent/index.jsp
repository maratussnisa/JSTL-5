<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <br><br><br>
 <h1>Splitting Data based on ( , ) </h1>
<h2>
			 <c:forTokens items="Micky-Disney,World is amazing,place" delims="," var="data">  
			   <c:out value="${data}"/><p>  
			</c:forTokens>  
</h2>

</body>
</html>