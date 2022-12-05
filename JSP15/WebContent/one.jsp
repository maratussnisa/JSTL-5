<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <jsp:useBean id="emp" class="com.info.EmployeeBean" scope="session"></jsp:useBean> 
  
		<!--  Setting Properties to Class -->
		<jsp:setProperty property="*" name="emp"/>  
		
		<!-- Getting Property from CLass -->  
		<br>  
		<h2>Result is : </h2>
		<h2>
		Employee Id : <jsp:getProperty property="eid" name="emp"/><br>  
		Employee Name : <jsp:getProperty property="ename" name="emp"/><br>  
		Employee Salary : <jsp:getProperty property="esalary" name="emp" /><br>  
        </h2>
        <br><br>
        <h1>
        <a href="two.jsp">Visit Page</a> 
        </h1>
</body>
</html>