<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Menu BANKONET</title>
	
	<%@page language="java" import="com.bankonet.model.Client" %>
	
</head>
<body>

	<% Client client = (Client) session.getAttribute("client");%>
		

	<h2> Bonjour <%= client.getPrenom() %> <%= client.getNom() %> </h2>
	
	<p> Opérations disponibles </p>
	
	<ul>
		<li><A href= "<%=request.getContextPath()+"/compteCourantListe"%>">Compte Courant</A></li>
	
	<% if (!client.getCompteEpargneList().isEmpty()) {%>
		<li><A href= "<%=request.getContextPath()+"/compteEpargneListe"%>">Compte Epargne</A></li>
	<%}%>
	
	</ul>
	<a href="<%=request.getContextPath()+"/initVirement"%>">Déconnection</a>
	
	
	<a href="<%=request.getContextPath()+"/fin"%>">Déconnection</a>
	
</body>
</html>