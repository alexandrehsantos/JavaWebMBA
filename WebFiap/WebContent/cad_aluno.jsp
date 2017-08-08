<%@page import="br.com.fiap.web.bean.AlunoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>

<jsp:useBean id="aluno" class="br.com.fiap.web.bean.AlunoBean" scope="page">
	<jsp:setProperty name="aluno" property="nome" param="nome" />
	<jsp:setProperty name="aluno" property="email" param="email" />
	<jsp:setProperty name="aluno" property="telefone" param="telefone" />
</jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:include page="cabecalho.jsp"></jsp:include>
		
		Olá <jsp:getProperty property="nome" name="aluno"/>
		${aluno.email}
</body>
</html>