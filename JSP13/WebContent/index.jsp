<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <h3>JSP page: Forward</h3>
		<jsp:forward page="one.jsp">
		    <jsp:param name ="date" value="15-02-2021" />
		    <jsp:param name ="time" value="10:15 AM" />
		    <jsp:param name ="data" value="Java Code" />
		</jsp:forward>

</body>
</html>