<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
   <%@ page errorPage = "error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp tutorial here </title>
</head>
<body>
	
	<h1>Home page here </h1>
	
	<h3>Name length :
	<% String name = null;
		name = "Ram kumar";
		int len = name.length();
		out.println(len);
	%>
	
	 </h3>
	 
	 <%= len %>
	
</body>
</html>