<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mi Primer Vista</title>
</head>
<body>
${mensajeAMostrar}

<table>
	<thead>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>DNI</th>
		<th>Edad</th>
		<th>Genero</th>
	</thead>
	<tbody>
		<c:forEach items="${personaList}" var="item">
		<tr>
			<td><c:out value="${item.nombre}"></c:out></td>
			<td><c:out value="${item.apellido}"></c:out></td>
			<td><c:out value="${item.dni}"></c:out></td>
			<td><c:out value="${item.edad}"></c:out></td>
			<td><c:out value="${item.genero}"></c:out></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>