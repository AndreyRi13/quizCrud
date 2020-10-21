<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Artículo</title>
</head>
<body>
	<h1>Registrar Artículo</h1>
	
	<form action="adminArticulo?action=register" method="post">
		<table border="1" align="center">
		<tr>
			<td>Placa:</a></td>		
			<td><input type="text" name="placa"/></td>	
		</tr>
		<tr>
			<td>Marca:</a></td>		
			<td><input type="text" name="marca"/></td>	
		</tr>
		<tr>
			<td>Modelo:</a></td>		
			<td><input type="text" name="modelo"/></td>	
		</tr>
		<tr>
			<td>Año:</a></td>		
			<td><input type="text" name="anio"/></td>	
		</tr>
		<tr>
			<td>Cilindraje:</a></td>		
			<td><input type="text" name="cilindraje"/></td>	
		</tr>			
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	
	</form>
</body>
</html>