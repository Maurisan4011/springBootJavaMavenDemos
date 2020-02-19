<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD SPRINGBOOT H2</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container mt-4">
	<form action="/agregar" method="POST" class="col-sm-5">
		<div class="card">
			<div class="card-header">
				<h4>Agregar Persona</h4>
			</div>
			<div class="card-body">
								<div class="form-group">
					<label>Nombre</label> 
					<input type="text" name="name" class="form-control">
				</div>
			</div>

			<div class="card-footer"></div>

			<input type="submit" value="Guardar" class="btn btn-info"> 
			<a href="/listar" class="btn btn-link">volver</a>
		</div>

	</form>

</body>
</html>