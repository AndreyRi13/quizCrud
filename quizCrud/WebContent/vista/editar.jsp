
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Artículo</title>
</head>
<body>
<h1>Actualizar Artículo</h1>
	<form action="adminArticulo?action=editar" method="post" >
		<table>
			<tr>
				<td><label>Id</label></td>
				<td><input type="text" name="id" value="<c:out value="${articulo.id}"></c:out>" ></td>
			</tr>
			<tr>
				<td><label>Placa</label></td>
				<td><input type="text" name="placa" value='<c:out value="${articulo.placa}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Marca</label></td>
				<td><input type="text" name="marca" value='<c:out value="${articulo.marca}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Modelo</label></td>
				<td><input type="text" name="modelo" value='<c:out value="${articulo.modelo}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Año</label></td>
				<td><input type="text" name="anio" value='<c:out value="${articulo.anio }"></c:out>' ></td>
			</tr>
			
			<tr>
				<td><label>Cilindraje</label></td>
				<td><input type="text" name="cilindraje" value='<c:out value="${articulo.cilindraje }"></c:out>' ></td>
			</tr>
			
		</table>
	
		<input type="submit" name="registrar" value="Guardar"> 
	</form>

</body>
</html>

