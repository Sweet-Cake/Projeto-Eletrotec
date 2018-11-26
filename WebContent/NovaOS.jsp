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
<title>ELETROTEC - Criar OS</title>
<script>
	$(document).ready(function(){
		$('#adicionar').click(function(){
			var numos=$('#numos').val();
			var aparelho=$('#aparelho').val();
			var modelo=$('#modelo').val();
			var tipo=$('#tipo').select().val();
			var obs=$('#obs').val();
			var acessorio=$('#acessorio').val();
			var cmd= 'adicionar';
			$('#tabela').append('<tr><th>'+aparelho+'</th><th>'+modelo+
					'</th><th>'+tipo+'</th><th>'+obs+'</th><th>'+acessorio+
					'</th> <th><input class="botao" id="excluir" type="button" value="Excluir" onclick="deletar(this)"/></th></tr>');
			
			$.ajax({
				type: 'POST',
				data:{numos: numos, 
					aparelho: aparelho,
					modelo: modelo,
					tipo: tipo,
					obs: obs,
					acessorio: acessorio,
					cmd: cmd},
				url: 'ControleOS',
				success:function(result){
					alert('foi');
				}
			});
		});	
		
	});
</script>
</head>
<body>
	<div id='cssmenu'>
		<ul>
			<li><h1>ELETROTEC</h1></li>
			<li class='active'><a href='NovaOS.jsp'>Criar OS</a></li>
			<li><a href='VerOS.jsp'>Ver OS</a></li>
			<li><a href='NovoCliente.jsp'>Novo Cliente</a></li>
			<li><a href='VerClientes.jsp'>Ver Clientes</a></li>
			<li><a href='NovoDefasado.jsp'>Adicionar Defasado</a></li>
			<li><a href='VerDefasados.jsp'>Ver Defasados</a></li>
		</ul>
	</div>
	
	<div class="container">
	<h2>Criar OS</h2>
	<form method="POST" action="./ControleOS">
	<label>OS</label>
	<input class="input" type="text" name="numos" id="numos"/>
	<input class="botao" id="PesquisarOS" type="button" value="Pesquisar" name="cmd" />
	<label>CPF</label>
	<input class="input" type="text" name="cpf" id="cpf"/>
	<input class="botao" id="PesquisarCPF" type="button" value="Pesquisar" name="cmd" />
	<br>
	<label>Cliente</label>
	<input class="input" type="text" name="cliente" id="cliente"/>
	<br><br>
	<h4>Eletrônicos</h4>
	<label>Aparelho</label>
	<input class="input" type="text" name="aparelho" id="aparelho"/>  
	<label>Modelo</label>
	<input class="input" type="text" name="modelo" id="modelo"/>
	<br>
	<label>Tipo</label>
	<select name="tipo"  id="tipo">
		<option value="TV LED">TV LED</option>
		<option value="TV PLASMA">TV PLASMA</option>
		<option value="TV TUBO">TV TUBO</option>
	</select>
	<br>
	<label>Observação</label>
	<input class="input" type="text" name="obs" id="obs" />
	<label>Acessório</label>
	<input class="input" type="text" name="acessorio" id="acessorio"/>  
	<br>
	<input class="botao" id="adicionar" type="button" value="Adicionar Eletrônico" name="adicionar" /><br><br>
	<table style="width:100%" id="tabela">
	  <tr>
	    <th>Aparelho</th>
	    <th>Modelo</th> 
	    <th>Tipo</th>
	    <th>Observação</th>
	    <th>Acessório</th>
	    <th>Ação</th>
	  </tr>
	</table>
	<br>
	<input type="submit" value="Enviar" name="cmd" id="Enviar">
	</form>
	<script>
	function deletar(coluna){
		 $(coluna).parents("tr").remove()
	}
	</script>
	</div>
</body>
</html>