<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssstyle.css" />
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="script.js"></script>
<title>ELETROTEC - Novo Cliente</title>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#Enviar').click(function(){
					alert($('estado').val());
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
			<li class='active'><a href='NovoCliente.jsp'>Novo Cliente</a></li>
			<li><a href='VerClientes.jsp'>Ver Clientes</a></li>
			<li><a href='NovoDefasado.jsp'>Adicionar Defasado</a></li>
			<li><a href='VerDefasados.jsp'>Ver Defasados</a></li>
		</ul>
	</div>
	
	<div class="container">
	<h2>Novo Cliente</h2>
	<form method="POST" action="./ControleCliente">
	<label>Nome</label>
	<input class="input" type="text" name="nome" id="nome"/>
	<br>
	<label>CPF</label>
	<input class="input" type="text" name="cpf" id="cpf"/>
	<input class="botao" id="Pesquisar" type="button" value="Pesquisar" name="cmd" />
	<br>
	<label>Endereço</label>
	<input class="input" type="text" name="endereco" id="endereco"/>
	<br>
	<label>Bairro</label>
	<input class="input" type="text" name="bairro" id="bairro"/>  
	<label>Cidade</label>
	<input class="input" type="text" name="cidade" id="cidade"/>
	<label>Estado</label>
	<input class="input" type="text" name="estado" id="estado"/>
	<br><br>
	<h4>Telefones</h4>
	<br>
	<label>Telefone Residência</label>
	<input class="input" type="text" name="telefoneresidencia" id="telefoneresidencia" />  
	<br>
	<label>Telefone Celular</label>
	<input class="input" type="text" name="telefonecelular" id="telefonerecelular" value="---"/>  
	<br>
	<input type="submit" value="Enviar" id="Enviar">
	</form>
	</div>
</body>
</html>