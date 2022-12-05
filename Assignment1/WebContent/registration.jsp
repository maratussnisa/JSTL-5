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
	<p>Address: <input type="text" name="address" size="20"></p>					
	<p>Phone: <input type="text" name="phone" size="20"></p>
	<p>City: <input type="text" name="city" size="20"></p>
	<p>Country: <input type="text" name="country" size="20"></p>
	<p>Education: <input type="text" name="education" size="20"></p>
    <p>Photo<input type = "file" name = "photo" size = "50" /></p>
	<input type="submit" name="submit" value="Submit">	
	</form>	
</div>

</body>
</html>