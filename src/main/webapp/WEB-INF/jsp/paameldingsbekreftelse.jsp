

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>P�meldingsbekreftelse</title>
</head>
<body>
	<h2>P�meldingsbekreftelse</h2>
	<p>P�meldingen er mottatt for</p>
	<p>
		&nbsp;&nbsp;&nbsp;${skjema.fornavn} <br />
		&nbsp;&nbsp;&nbsp;${skjema.etternavn}<br />
		&nbsp;&nbsp;&nbsp;${skjema.mobil}<br /> &nbsp;&nbsp;&nbsp;${skjema.kjonn}
	</p>
	<a href="DeltagerListeServlet">G� til deltagerlisten</a>
</body>
</html>