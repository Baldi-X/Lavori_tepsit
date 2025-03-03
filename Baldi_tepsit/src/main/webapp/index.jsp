<html>
<body>

<h3>Benvenuto Utente Curioso, questo e' la mia prima JSP. Oggi e' il giorno</h3>
<h3>oggi e' il giorno:

	<script>
		var data = new Date();
	  	var data2 = data.getDate() + "/" + (data.getMonth() + 1) + "/" + data.getFullYear();
		document.write(data2);
	</script>
</h3>
<a href="author.jsp">vai all'autore</a>


</body>
</html>
