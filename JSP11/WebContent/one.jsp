<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Forward Mechanism</h1>

		<h2>Employee Status</h2>
		My name is: <%=request.getParameter("name") %><br>
		Website: <%=request.getParameter("site") %><br>
		City: <%=request.getParameter("city") %><br>
		Forward Request came from the page: <%=request.getParameter("reqcamefrom") %>

</body>
</html>