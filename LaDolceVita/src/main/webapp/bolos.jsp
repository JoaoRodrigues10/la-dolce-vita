<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/css/bolos.css">
    <title>Bolos</title>
</head>

<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>

    <div class="titulo">BOLOS</div>

    <div class="conteudo">


            <c:forEach var="categoria" items="${categorias}">

                <div class="box">
                    <img src="../../img/bolo.jfif" alt="">
                    <div class="nome">${categoria.name}</div>
                    <div class="linhaP"> </div>
                    <div class="valor">${categoria.preco}</div>
                </div>

            </c:forEach>



    </div>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>