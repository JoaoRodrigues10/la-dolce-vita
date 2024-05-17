<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/css/cadastroProdutos.css">

    <title>Menu</title>
    <link href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="img">
        <img src="/img/logo.jfif" alt="" onclick="window.location.href='/index.jsp'">
    </div>

    <div class="linha"></div>

    <div class="titulo">ADICIONAR PRODUTO</div>

    <div class="conteudo">

    <form action="/create-produto" method="post" enctype="multipart/form-data">

    <label>Nome:</label>
    <input type="text" name="name-produto" id="name-produto" value="${param.name}">
    <input type="hidden" id="id" name="id" value="${param.id}">

    <label>Categoria:</label>
    <select name="categoria-produto" id="categoria-produto">
                <option value="Bolo" ${param.categoria == 'Bolo' ? 'selected' : ''}>Bolo</option>
                <option value="Torta" ${param.categoria == 'Torta' ? 'selected' : ''}>Torta</option>
                <option value="Gateau" ${param.categoria == 'Gateau' ? 'selected' : ''}>Gateau</option>
    </select>

    <label>Descrição:</label>
    <input type="text" name="descricao-produto" id="descricao-produto" value="${param.descricao}">

    <label>Preço:</label>
    <input type="text" name="preco-produto" id="preco-produto" value="${param.preco}">

    <label>Imagem:</label>
    <input type="file" name="image" id="image">

    <div class="botao">
   <a href="menuADM.jsp"> VOLTAR AO MENU</a>
    <button type="submit">ADICIONAR</button>
    </div>
</form>

    <div class="aviso">
        <div class="comunicado" onclick="window.location.href='/index.jsp'">WWW.LADOLCEVITA.COM.BR</div>
    </div>
</body>
</html>