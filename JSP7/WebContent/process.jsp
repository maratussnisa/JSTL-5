
<%@ page errorPage="error.jsp" %> 
<h1> 
<%  
  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
  
%> 
<%
         // Throw an exception to invoke the error page
         
         if (b == 0) {
            throw new RuntimeException("Error condition!!!");
         }
      %>
</h1>
