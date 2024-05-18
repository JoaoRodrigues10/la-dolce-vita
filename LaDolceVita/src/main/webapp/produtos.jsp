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
                     <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="setId(${categoria.id}, '${categoria.image}', '${categoria.name}', '${categoria.preco}')">
                            Ver Produtos
                     </button>

                </div>

            </c:forEach>



    </div>




        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">
                            <div id="productName" class="nome"></div>
                        </h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="box">
                            <input id="productId" type="hidden"></input>
                             <img id="productImage" src="" alt="">
                             <div id="productName" class="nome"></div>
                             <div class="linhaP"></div>
                             <div id="productPrice" class="valor"></div>
                         </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                        <button type="button" class="btn btn-primary">Adicionar Produtos na Sacola</button>
                    </div>
                </div>
            </div>
        </div>


    <script>

        function setId(id, image, name, preco) {
            document.getElementById('productId').innerText = id;
            document.getElementById('productImage').src = "../../img/" + image;
            document.getElementById('productName').innerText = name;
            document.getElementById('productPrice').innerText = preco;
        }
    </script>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>