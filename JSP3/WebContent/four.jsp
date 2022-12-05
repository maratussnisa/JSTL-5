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
<br><br><br><br>
<h1>Final Result is : </h1>
<h2>
      <%="Employee Name is : " %>
      <%= application.getAttribute("username") %>
      <br>
      Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</h2>
</body>
</html>