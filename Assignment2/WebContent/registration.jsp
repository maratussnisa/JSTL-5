<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<h1 align="center"><b>Registration Page</b></h1>
	<form action="<%= request.getContextPath()%>/code1" method="post" enctype="multipart/form-data">
	
	<p>Name: <input type="text" name="name" size="20"></p>
	<p>Email: <input type="text" name="email" size="20"></p>	
	<p>Username: <input type="text" name="username" size="20"></p>					
	<p>Password: <input type="password" name="pass1" size="20"></p>
	<% String pswrd1 = request.getParameter("pass1"); %>
	<p>Confirm Password: <input type="password" name="pass2" size="20"></p>
	<% String pswrd2 = request.getParameter("pass2"); %>
	<p>Contact No: <input type="text" name="phone" size="20"></p>
    <p>Photo<input type = "file" name = "photo" size = "50" /></p>
	<input type="submit" name="submit" value="Submit">	
	
	<% 
	if (pswrd1!=null && pswrd2!=null) {	 
  	if (!pswrd1.equals(pswrd2)) { 
	%>
     	Both passwords must be the same.
	<%
  		} else {
	%>
     	<p>Inserted Successfully</p>
	<%
 	 }
	} 
	%>
	 	</form>	
	</div>
</body>
</html>