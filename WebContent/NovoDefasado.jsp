<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/cssstyle.css" />
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="script.js"></script>
<title>ELETROTEC - Inserir eletrônico defasado</title>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#Pesquisar').click(function(){
					alert('Pesquisar');
				});
			});
		</script>
</head>
<body>
	<div id='cssmenu'>

		<ul>
			<li><h1>ELETROTEC</h1></li>
			<li><a href='NovaOS.jsp'>Criar OS</a></li>
			<li><a href='VerOS.jsp'>Ver OS</a></li>
			<li><a href='NovoCliente.jsp'>Novo Cliente</a></li>
			<li><a href='VerClientes.jsp'>Ver Clientes</a></li>
			<li class='active'><a href='NovoDefasado.jsp'>Adicionar Defasado</a></li>
			<li><a href='VerDefasados.jsp'>Ver Defasados</a></li>
		</ul>
	</div>

	<div class="container">
		<h2>Adicionar Eletrônico Defasado</h2>
		<br>
		<form method="POST" action="./ControleDefasados">
			<label>Modelo</label> <input class="input" type="text" name="modelo"
				id="Modelo" /> <input class="botao" id="Pesquisar" type="button"
				value="Pesquisar" name="cmd" /> <br> <label>Razão</label> 
				<input class="input" type="text" name="razao" id="Razao" /> <br> 
				<input type="submit" value="Enviar">
		</form>
	</div>
</body>
</html>