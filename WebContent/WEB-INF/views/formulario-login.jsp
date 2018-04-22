<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/bootstrap.css">
		<title>Tarefas Online</title>
	</head>
	<body>
		<h2>Entrar no Sistema de Tarefas</h2>
		<h4 style="color: red">${param.erro}</h4>
		<main class="container">
			<table class="table">
				<form action="efetuaLogin" method="post">
					<tr>
						<td>USUÁRIO:</td>
						<td><input name="login" type="text"/></td>
					</tr>
					<tr>
						<td>SENHA:</td>
						<td><input name="senha" type="password"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="entrar"/></td>
					</tr>
				</form>
			</table>
		</main>
	</body>
</html>