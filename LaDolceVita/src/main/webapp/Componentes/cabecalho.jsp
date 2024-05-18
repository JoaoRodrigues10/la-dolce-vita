<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/Componentes/cabecalho.css">
    <link rel="shortcut icon" href="favicon2.png">
    <title>Cabeçalho</title>
</head>

<body>
    <div class="aviso">
        <div class="comunicado">FAÇA AGORA SEU PEDIDO ONLINE</div>
    </div>

    <div class="cabecalho">
        <div class="logo">
            <img src="/img/logo.jfif" alt="" onclick="window.location.href='/index.jsp'">
        </div>
        <div class="opcoes">
            <a href="/index.jsp"><buttom class="btn btn-custom">INÍCIO</buttom></a>
            <a href="/menu.jsp"><buttom class="btn btn-custom">MENU</buttom></a>
            <a href="/index.jsp#sobre"><buttom class="btn btn-custom">SOBRE</buttom></a>
            <a href="#rodape"><buttom class="btn btn-custom">CONTATO</buttom></a>
        </div>
        <div class="acoes">
            <a href="/menuADM.jsp"><img src="/img/lupa.png" alt=""></a>
            <a href="/login.jsp"><img src="/img/perfil.png" alt=""></a>
            <a href="/carrinho.jsp"><img src="/img/sacola.png" alt=""></a>
        </div>
    </div>

    <div class="linha"></div>
</body>
</html>