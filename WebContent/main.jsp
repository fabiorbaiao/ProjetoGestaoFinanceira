<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="negocio.Usuario"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String endereco = "";
	int idEndereco = 0;
	
	String empresa = "";
	int idEmpresa = 0;
	
	String usuario = "";
	int idUsuario = 0;
	
	Usuario user = null;
	
	if(request.getAttribute("objUsuario") != null){
		user = (Usuario)request.getAttribute("objUsuario");
		
		usuario = user.getNome();	
		
		if(user.getEndereco() != null){
			idEndereco = user.getEndereco().getId();
			String bairro = user.getEndereco().getBairro();
			String cidade = user.getEndereco().getCidade();
			String uf = user.getEndereco().getUf();
			
			endereco = String.format("%s - %s/%s", bairro, cidade, uf);
		}
		
		
		if(user.getEmpresa() != null){
			idEmpresa = user.getEmpresa().getId(); 		 
			empresa = user.getEmpresa().getNomeFantasia();
		}
	}
	
	%>

	<div align="right" style="height: 35%;">
		<form action="ControlaAcesso" method="get">
			Olá, <%=usuario%>!!!
			
			<input type="hidden" name="usuario_id" value="<%=idUsuario%>">
			
			<input type="submit" value="Sair">
		</form>
		<hr>
	</div>
	
	<div style="height: 65%;">
	
		<div style="width: 45%; float: left">
			<h3>Cadastros:</h3>
			
			<form action="" method="get">
				<input type="hidden" name="endereco_id" value="<%=idEndereco%>">
		
				<h4><input type="submit" value="Endereço:" style="width: 100px"> <%=endereco%></h4>
			</form>
			
			<form action="ControlaEmpresa" method="get">
				<input type="hidden" name="empresa_id" value="<%=idEmpresa%>">
		
				<h4><input type="submit" value="Empresa:" style="width: 100px"> <%=empresa%></h4>
			</form>
		</div>
	
		<div align="center" style="width: 45%; float: right;">
			<h3>Operações:</h3>
		</div>
	</div>			
	
</body>
</html>