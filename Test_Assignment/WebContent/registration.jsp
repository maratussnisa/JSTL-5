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
	<form action="code1" method="post" enctype="multipart/form-data">
	
		<label for="name">Name</label>
		<input type="text" id="name" name="name" placeholder="Your Name..">
		
		<label for="email">Email</label>
		<input type="text" id="email" name="email" placeholder="Your email..">
		
		<label for="address">Address</label>
		<input type="text" id="address" name="address" placeholder="Your address..">
		
		<label for="phone">Phone</label>
		<input type="text" id="phone" name="phone" placeholder="Your phone number..">
		
		<label for="city">City</label>
		<input type="text" id="city" name="city" placeholder="Your city..">
		
		<label for="country">Country</label>
		<select id="country" name="country">
			<option value="australia">Australia</option>
			<option value="canada">Canada</option>
			<option value="usa">USA</option>
		</select>
		
		<label for="education">Education</label>
		<input type="text" id="education" name="education" placeholder="Yout education">
				
		<label for="photo">Photo</label>
		<input type= "file" id="photo" name="photo">

		<input type="submit" value="Submit">
		</form>
	</div>

</body>
</html>