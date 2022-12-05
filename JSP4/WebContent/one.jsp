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
<h1>
     <%  
		String fname=request.getParameter("firstname"); 
        String lname=request.getParameter("lastname");
		out.print("Employee First Name :  "+fname);  
		out.print("<br><br>");
		out.print("Employee Last Name :  "+lname); 
	 %>  
	
	 <br>
	 Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</h1>
</body>
</html>