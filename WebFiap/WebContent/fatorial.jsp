<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de fatorial</h3>
	<%
		int fat = 1;
		for (int n = 1; n <= 10; n++) {
			fat *= n;
	%>

	<C:out value="<p> O fatorial de </p>"></C:out>
	<%
		}
	%>
</body>
</html>