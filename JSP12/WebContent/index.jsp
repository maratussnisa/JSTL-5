<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            <h1>Include Mechanism</h1>
            <br>
			<jsp:include page="one.jsp"> 
				<jsp:param name="name" value="Micky" /> 
				<jsp:param name="site" value="ATS.com" /> 
				<jsp:param name="city" value="Hyd" /> 
				<jsp:param name="reqcamefrom" value="index.jsp" /> 
			</jsp:include> 



</body>
</html>