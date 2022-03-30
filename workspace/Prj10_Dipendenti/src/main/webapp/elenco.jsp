<!DOCTYPE html>
<%@page import="model.Dipendente"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="utf-8">
<title>Gestionale dipendenti</title>
</head>
<body>

	<h1>Elenco dipendenti ITS-Cloud2022</h1>

<table>
  <tr>
    <th>Matricola</th>
    <th>Nome</th>
  </tr>

<% List<Dipendente> dipendenti = (List<Dipendente>) request.getAttribute("elencoDipendenti"); %>
<% for (Dipendente d : dipendenti){ %>
  <tr>
    <td><%= d.getnMatr() %></td>
    <td><%= d %></td>
  </tr>
<% } %>  
  
</table>


</body>
</html>