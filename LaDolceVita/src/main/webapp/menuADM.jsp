<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/css/menuADM.css">
    <title>Menu</title>
</head>

<body>
    <div class="container">
    <div class="img">
        <img src="/img/logo.jfif" alt="" onclick="window.location.href='/index.jsp'">
    </div>

    <div class="linha"></div>

    <div class="titulo">MENU</div>

    <div class="conteudo">
        <div class="parte1">
            <a href="/fluxoCaixa.jsp">
                <div class="box">
                    <div class="descricao">LUCRO</div>
                </div>
            </a>
            <a href="/dashboard.jsp">
                <div class="box">
                    <div class="descricao">ESTOQUE</div>
                </div>
            </a>
            <a href="/cadastroProdutos.jsp">
                <div class="box">
                    <div class="descricao">PRODUTOS</div>
                </div>
            </a>
        </div>
        </div>

        <div class="aviso">
            <div class="comunicado" onclick="window.location.href='/index.jsp'">WWW.LADOLCEVITA.COM.BR</div>
        </div>
    </div>

</body>
</html>