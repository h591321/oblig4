<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Deltagerliste</title>
</head>
<body>
	<h2>Deltagerliste</h2>
	<table class="pure-table">
		<tr bgcolor="#cccccc">
			<th>Kjønn</th>
			<th align="left">Navn</th>
			<th align="left">Mobil</th>
		</tr>
		<c:forEach items="${deltagerListe}" var="d">
		<tr bgcolor="#ffffff">
			<td align="center"><c:out value="${d.kjonn}"/></td>
			<td><c:out value="${d.fornavn}"/> <c:out value="${d.etternavn}"/></td>
			<td><c:out value="${d.mobil}"/></td>
		</tr>
		</c:forEach>
		<tr bgcolor="#aaffaa">
			<td align="center">&#9792;</td>
			<td>Anne Annesen</td>
			<td>445 54 455</td>
		</tr>
		<tr bgcolor="#ffffff">
			<td align="center">&#9794;</td>
			<td>Arne Arnesen</td>
			<td>901 23 456</td>
		</tr>
		<tr bgcolor="#ffffff">
			<td align="center">&#9794;</td>
			<td>Per Viskeler</td>
			<td>112 23 344</td>
		</tr>
		
	</table>
	<p>
		<a href="LogutServlet">Ferdig</a>
	</p>
</body>
</html>