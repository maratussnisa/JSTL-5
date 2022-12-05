<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    h1{
        color:red;
      }
</style>
</head>
<body>

<br><br><br>
<h1>
		<% 
		String data2=(String)session.getAttribute("session-id");
		out.println("Hi : "+ data2+". Id/Password are wrong. Please try Again.");
		%> 
</h1>

</body>
</html>