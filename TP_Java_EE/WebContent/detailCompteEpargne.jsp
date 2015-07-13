<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld" %>
	
	<%@page language="java" import="com.bankonet.model.Client" %>
	<%@page language="java" import="com.bankonet.model.Compte" %>
	<%@page language="java" import="com.bankonet.model.CompteEpargne" %>
</head>
<body>
	<h1>Détail du compte épargne:</h1>
	
	<table border=1;>
		<tr>
			<td>Identifiant</td>
			<td><c:out value="${compte.identifiant}"></c:out>
		</td>
		<tr>
			<td>libelle</td>
			<td><c:out value="${compte.libelle}"></c:out>
		</td>
		<tr>
			<td>Solde</td>
			<td><c:out value="${compte.solde}"></c:out>
		</td>
		<tr>
			<td>Taux d'intérêt</td>
			<td><c:out value="${compte.tauxInteret}"></c:out>
		</td>
		<tr>
			<td>Plafond des échéances</td>
			<td><c:out value="${compte.plafond}"></c:out>
		</td>
		<c:remove var="compte"/>
	</table>
		
	<A href= "<%=request.getContextPath()+"/pagePrincipale.jsp"%>">Menu principal</A>
</body>
</html>