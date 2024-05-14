<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "/css/produtos.css">
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