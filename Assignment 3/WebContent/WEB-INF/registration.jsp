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
	<h1 align="center"><b>User Login</b></h1>
	<form action="<%= request.getContextPath()%>/code1" method="post" enctype="multipart/form-data">
	
	<p>UserName: <input type="text" name="username" size="20"></p>
	<p>Password: <input type="text" name="password" size="20"></p>	
	<input type="submit" name="submit" value="Submit">	
	
	 	</form>	
	</div>
	

</body>
</html>