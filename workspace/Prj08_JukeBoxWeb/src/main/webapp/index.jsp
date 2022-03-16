<!DOCTYPE html>
<%@page import="database.Discoteca"%>
<%@page import="model.Canzone"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Musica</title>
		<style>
			h1 {color:red;}
		</style>
	</head>
	<!-- commento -->
	<body>
	
		<h1 id="titolo">Juke Box</h1>
	
	<form method="post" action="">
		<input type="text" name="titolo" placeholder="titolo">
		<input type="text" name="cantante" placeholder="cantante">
		<input type="submit" value="Aggiungi canzone">
	</form>
	
	<% //scriptlet
		
		if (request.getParameter("titolo") != null && request.getParameter("cantante")!= null ){
			
			//salvo nell var di tipo string il titolo e il cantante
			String titolo = request.getParameter("titolo");
			String cantante = request.getParameter("cantante");

			//creo un oggetto di tipo canzone
			Canzone c = new Canzone(titolo, cantante);

			//aggiungo la canzone c alla collezione (arraylist)
			Discoteca.dischi.add(c);
		}
	%>
	<ul>
		<% for (Canzone canz : Discoteca.dischi){ %>
			<li><%= canz %> <a target="_blank" href="https://www.google.com/search?q=<%= canz.titolo %>&tbm=vid">[play]</a></li>
		<% } %>
	</ul>

<script>
	const titolo = document.getElementById("titolo");
	titolo.textContent = "Prova microfono";

</script>


	</body>
</html>