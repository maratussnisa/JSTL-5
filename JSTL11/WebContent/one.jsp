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
	String eid=request.getParameter("id");
	String ename=request.getParameter("name");
	
	
	out.println("Employee Id :  "+eid);
	out.println("<br>");
	out.println("Employee Name :  "+ename);

	
	%>
</h1>			

</body>
</html>