<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Påmelding</title>
</head>
<body>
	<h2>Påmelding</h2>
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="fornavn">Fornavn:</label> <input type="text" name="fornavn" value="${skjema.fornavn}"> 
					<font color="red"> ${skjema.fornavnFeil}</font>
			</div>
			<div class="pure-control-group">
				<label for="etternavn">Etternavn:</label> <input type="text" name="etternavn" value="${skjema.etternavn}"> 
					<font color="red">  ${skjema.etternavnFeil}</font>
			</div>
			<div class="pure-control-group">
				<label for="mobil">Mobil (8 siffer):</label> <input type="text" name="mobil" value="${skjema.mobil}"> 
					<font color="red"> ${skjema.mobilFeil}</font>
			</div>
			<div class="pure-control-group">
				<label for="password">Passord:</label> <input type="password" name="passord" value="${skjema.passord}"> 
					<font color="red"> ${skjema.passordFeil}</font>
			</div>
			<div class="pure-control-group">
				<label for="passordRepetert">Passord repetert:</label> <input type="password" name="passordRepetert" value="${skjema.passordRepetert}"> 
					<font color="red"> ${skjema.passordRepetertFeil}</font>
			</div>
			<div class="pure-control-group">
				<label for="kjonn">Kjønn:</label> <input type="radio" name="kjonn" value="mann">mann
				<input type="radio" name="kjonn" value="kvinne">kvinne
				<font color="red"> ${skjema.kjonnFeil}</font>
			</div>
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary">Meld meg på</button>
			</div>
		</fieldset>
	</form>

</body></html>