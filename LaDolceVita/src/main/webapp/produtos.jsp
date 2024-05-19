<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

     <%@ page contentType="text/html; charset=UTF-8" %>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

            <link rel="stylesheet"href="/css/produtos.css">
    <title>
        <c:forEach var="categoria" items="${categorias}" varStatus="loop">
          <c:if test="${loop.first and categoria.id > 0}">
              ${categoria.categoria}
          </c:if>
        </c:forEach>
    </title>
</head>

<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>

    <c:forEach var="categoria" items="${categorias}" varStatus="loop">
           <c:if test="${loop.first and categoria.id > 0}">
               <div class="titulo">${categoria.categoria}</div>
           </c:if>
       </c:forEach>

    <div class="conteudo">


            <c:forEach var="categoria" items="${categorias}">

                <div class="box">
                    <img src="../../img/${categoria.image}" alt="">
                    <div class="nome">${categoria.name}</div>
                    <div class="linhaP">  </div>
                    <div class="valor">${categoria.preco}</div>
                </div>

            </c:forEach>



    </div>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>