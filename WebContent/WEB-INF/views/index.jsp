<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/bootstrap.css">
		<title>Gerenciador de Tarefas</title>
	</head>
	<body>
		<c:if test="${not empty usuarioLogado.login}">
			<h2>Bem vindo ${usuarioLogado.login}</h2>
		</c:if>
		<h3>Sistemas disponíveis</h3>
		<div>
			<p><a href="novaTarefa">Adicionar Tarefa</a></p>
			<p><a href="listaTarefas">Exibir Tarefas</a></p>
			<c:if test="${not empty usuarioLogado.login}">
				<p><a href="logout">Sair</a></p>
			</c:if>
		</div>
	</body>
</html>