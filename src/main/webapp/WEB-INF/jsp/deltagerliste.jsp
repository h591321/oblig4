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
        <c:choose>
        <c:when test = "${d.mobil eq mobil}"><tr bgcolor="#68F35F"></c:when>
        <c:otherwise><tr bgcolor="#ffffff"></c:otherwise>
        </c:choose>
            <td align="center">
            <c:choose>
                <c:when test="${d.kjonn eq 'kvinne'}"><font color="pink">&#9792;</font></c:when>
                <c:otherwise><font color="blue">&#9794;</font></c:otherwise>
            </c:choose>
            </td>
            <td><c:out value="${d.fornavn}"/> <c:out value="${d.etternavn}"/></td>
            <td><c:out value="${d.mobil}"/></td>
        </c:forEach>
		
	</table>
	<p>
		<a href="LogutServlet">Ferdig</a>
	</p>
</body>
</html>