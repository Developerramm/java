<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="jakarta.tags.core" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Ram Kumar Maniyari </h3>
	<h3>JSP Directive tutorial </h3>
	<p>JSP Demo tutorial here </p>
	<b>this is bold tag </b>
	<ul>
		<li>Appble</li>
		<li>Banana</li>
		<li>Orange</li>
	</ul>
	
	<c:set var = "name" value = "Ram maniyari Sitamarhi"></c:set>
	<c:out value="${name}"></c:out>
	
	<c:if test="${10 > 5 }">
		<h3>This is true block here </h3>
	</c:if>
	
	
	
</body>
</html>