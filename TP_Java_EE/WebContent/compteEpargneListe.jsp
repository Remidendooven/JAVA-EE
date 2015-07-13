<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="/WEB-INF/fmt.tld" %>
		
</head>
<body>

	<h1>Comptes Epargne</h1>

	<table border=1;>
		<tr>
			<td>Intitulé</td>
			<td>Solde</td>
			<td>Taux d'intérêt</td>
			<td>Plafond</td>
		</tr>
	
		<c:forEach items="${client.compteEpargneList}" var="tempclient">
			<tr>
				
			
				<td> <A href= "<c:url value="/detailCompteEpargne">
									<c:param name="CompteId" value="${tempclient.identifiant}"/>
  								</c:url>">
						<c:out value="${tempclient.libelle}" /> 
					</A>
					
				</td>				
				<td> <c:out value="${tempclient.solde}" /> </td>
				<td> <c:out value="${tempclient.tauxInteret}" /> </td>
				<td> <c:out value="${tempclient.plafond}" /> </td>
		</c:forEach>
	</table>
	<br>
	<A href= "<%=request.getContextPath()+"/pagePrincipale.jsp"%>">Menu principal</A>
	
</body>
</html>