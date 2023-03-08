<html>
<head>
    <link rel="stylesheet" href="style.css" />
    <title>IMC</title>
</head>
<body>
<form name="imcform" action="calc" method="POST">
    <label for="peso">Peso(kg)</label>
    <input type="text" id="peso" name="peso">
    <label for="altura">Altura(m)</label>
    <input type="text" id="altura" name="altura">

    <input type="submit" value="Enviar" name="calcular">
<h1>IMC: ${imc}</h1>
</form>
</body>
</html>