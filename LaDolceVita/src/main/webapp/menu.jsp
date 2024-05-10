<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/css/menu.css">
    <title>Menu</title>
</head>

<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>

    <div class="titulo">MENU</div>

    <div class="conteudo">
        <div class="parte1">
            <a href="/bolos.jsp">
                <div class="box-bolo">
                    <div class="bolos">BOLOS</div>
                </div>
            </a>
            <a href="/tortas.jsp">
                <div class="box-torta">
                    <div class="tortas">TORTAS</div>
                </div>
            </a>
            <a href="/gateaus.jsp">
                <div class="box-gateau">
                    <div class="gateaus">GATEAUS</div>
                </div>
            </a>
        </div>
        <div class="parte2">
            <a href="/doces.jsp">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="/doces.html">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="/doces.html">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
        </div>
    </div>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>