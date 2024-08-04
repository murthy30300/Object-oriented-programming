<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
String ss=" ";
if(s1.equalsIgnoreCase("dhoni")&&(s2.equalsIgnoreCase("ms")))
{
	ss="Valid";
out.println("Your login credentials are"+ss);
}
else
{
	ss="Invalid and try again";
out.println("Your login credentials are"+ss);
}
%>

</body>
</html>

