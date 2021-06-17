<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<title>Candidato</title>
</head>
<body>


	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="#" class="navbar-brand">Registrar Usuario</a>
			</div>
			
		</nav>
	</header>

	<br>

	<div class="container col-md-5">

		<div class="card">

			<div class="card-body">


				<fieldset class="form-group">
					<label>Nombre</label> <input type="text"
						value="<c:out value='${Usuario.nombre}'/>" class="form-control"
						name="id" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Apellido</label> <input type="text"
						value="<c:out value='${Usuario.apellido}'/>"
						class="form-control" name="apellido" required="required">
				</fieldset>
				

				<fieldset class="form-group">
					<label>Documento</label> <input type="text"
						value="<c:out value='${candidato.documento}'/>"
						class="form-control" name="documento" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Email</label> <input type="email"
						value="<c:out value='${Usuario.Email}'/>" class="form-control"
						name="numero">
				</fieldset>

				<button type="submit" class="btn btn-success">Enviar</button>

				</form>

			</div>

		</div>

	</div>

</body>
</html>