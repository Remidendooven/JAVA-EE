<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<%@page language="java" import="com.bankonet.model.Client" %>
	<%@page language="java" import="com.bankonet.model.Compte" %>
	<%@page language="java" import="com.bankonet.model.CompteCourant" %>
	<%@page language="java" import="java.util.Iterator" %>
</head>
<body>
	<h1>Comptes courants</h1>
	
	<% Client client = (Client) session.getAttribute("client");
		Iterator ccIt = client.getCompteCourantList().iterator();
	%>
	
	<table cellspacing="5px" style="border:solid 1px black;">
		<tr>
			<td style="border:solid 1px black;">Intitulé</td>
			<td style="border:solid 1px black;">Solde</td>
			<td style="border:solid 1px black;">Découvert autorisé</td>
		</tr>
	<% while (ccIt.hasNext()) {
		CompteCourant cc = (CompteCourant)ccIt.next();%>
		<tr>
			<td style="border:solid 1px black;"> <%= cc.getLibelle()%></td>
			<td style="border:solid 1px black;"> <%= cc.getSolde()%></td>
			<td style="border:solid 1px black;"> <%= cc.getDecouvertAutorise()%></td>
		</tr>	
	<%}%>
	</table>
	
	<A href= "<%=request.getContextPath()+"/pagePrincipale.jsp"%>">Menu principal</A>
	
</body>
</html>