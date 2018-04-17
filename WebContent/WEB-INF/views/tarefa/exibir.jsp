<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="assets/css/bootstrap.css">
		<title>Gerenciador de Tarefas</title>
	</head>
	<body>
		<form action="modificarTarefa" method="post">
			<h3>Editando a tarefa: ${tarefa.id}</h3>
			<input name="id" type="hidden" value="${tarefa.id}" />			
			Descrição:<br/>
			<textarea name="descricao" rows="5" cols="100">${tarefa.descricao}</textarea><br/>
			Finalizada
			<input name="finalizado" type="checkbox" ${tarefa.finalizado ? "checked" : "" } /><br/>
			Data de Conclusão:
			<input name="dataFinalizacao" type="text" value="<fmt:formatDate value="${tarefa.dataFinalizacao}" pattern="dd/MM/yyyy" />" /><br/>
			<p><input type="submit" value="Salvar" />			
		</form>
		
	</body>
</html>