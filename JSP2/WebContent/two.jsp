<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<h1>Methods declaration</h1>
<br>
<h1>
		  <%! 
		  int sum(int num1, int num2, int num3){ 
		  return num1+num2+num3; 
		  } 
		  %> 
		
		  <%= "Result is: " + sum(10,40,50) %> 
</h1>  
  
</body>
</html>