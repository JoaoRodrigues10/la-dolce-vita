<html>
<head>
    <link href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h2>Novo Produto</h2>
<form action="/create-produto" method="post" enctype="multipart/form-data">
    <label>Nome</label>
    <input type="text" name="name-produto" id="name-produto" value="${param.name}">
    <input type="hidden" id="id" name="id" value="${param.id}">
    <label>Categoria</label>
    <input type="text" name="categoria-produto" id="categoria-produto" value="${param.categoria}">
    <label>Descricao</label>
    <input type="text" name="descricao-produto" id="descricao-produto" value="${param.descricao}">
    <label>Preco</label>
    <input type="text" name="preco-produto" id="preco-produto" value="${param.preco}">
    <br>
    <br>
    <div>
        <label>Imagem </label>
        <input type="file" name="image" id="image">
    </div>

    <br>
    <button type="submit">Save</button>
</form>
</body>
</html>