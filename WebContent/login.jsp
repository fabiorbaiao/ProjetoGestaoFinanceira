<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Acesso</title>
</head>
<body>
	<div align="right" style="height: 35%;">
		<form action="ControlaAcesso" method="post">
			Login/Senha: 
			<input type="text" name="login">
			<input type="password" name="senha">
			<input type="submit" value="Entrar">
		</form>
		<hr>
	</div>
	
	<div style="height: 65%;">
	
		<div align="center" style="width: 45%; float: left">
			<h3>Seja um novo gestor financeiro:</h3>
			
			<form action="ControlaUsuario" method="get">
				
				<h4>Nome</h4>
				<input type="text" name="nome" size="75" >
				
				<h4>E-mail</h4>
				<input type="text" name="email" size="75">

				<h4>Login</h4>
				<input type="text" name="login">

				<h4>Senha</h4>
				<input type="password" name="senha">
				
				<hr>
				
				<input type="submit" value="Cadastrar">	
				<%
				
				String mensagem = (String)request.getAttribute("msg") != null ?
						(String)request.getAttribute("msg") : "";
				
				%>
				<h3><%=mensagem%></h3>				
			</form>
		</div>
	
		<div align="center" style="width: 45%; float: right;">
			<img alt="Projeto Oportunidade" src="img/logo_projetooportunidade.png">
			
			<h2 style="color: blue;" >Implementando os seus sonhos!!!</h2>
			
			<br>
			
			<h2 style="color: blue;" >Fanpage:</h2>
			
			<h3 style="color: blue;" ><a href="facebook.com/projetooportunidade">facebook.com/projetooportunidade</a></h3>

			<h2 style="color: blue;" >Site:</h2>
			
			<h3 style="color: blue;" ><a href="projetooportunidade.com">projetooportunidade.com</a></h3>
		</div>
	</div>			
</body>
</html>