<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<h1>JSP include directive with parameters</h1> 
	
	<%!
	String country="India"; 
	String state="Telangana";
	String city="Hyd";
	%>
	<% 
	session.setAttribute("co", country);
	session.setAttribute("st", state);
	session.setAttribute("ci", city);
	%>
	<br>
    <%@ include file="one.jsp" %>
    
</body>
</html>