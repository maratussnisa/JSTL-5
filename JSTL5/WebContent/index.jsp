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
<br><br>

			 <c:catch var ="exp_message">  
			
			    <% int x = 10/0;%> 
			    <h2>Result is : <%= x %></h2> 
			    
			 </c:catch>  
<h1>			  
			<c:if test = "${exp_message != null}">  
			   <p>=> The type of exception is : ${exp_message} <br />  
			   => There is an exception: ${exp_message.message}</p>  
			</c:if>  
</h1>

</body>
</html>