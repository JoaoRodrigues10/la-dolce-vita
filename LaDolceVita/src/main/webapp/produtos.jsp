<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

     <%@ page contentType="text/html; charset=UTF-8" %>
            <%@ page contentType="text/html; charset=UTF-8" %>
            <%@ page pageEncoding="UTF-8" %>
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
                    <div class="valor"> R$ ${categoria.preco}</div>
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#categoryModal" onclick="openModal('${categoria.name}', '${categoria.image}', '${categoria.preco}', '${categoria.descricao}', '${categoria.id}')">
                        Detalhes
                    </button>
                </div>

            </c:forEach>



    </div>

    <!-- Vertically centered modal -->
    <div class="modal fade" id="categoryModal" tabindex="-1" aria-labelledby="categoryModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">

                    <div class="modal-header">
                        <h5 class="modal-title" id="categoryModalLabel">Detalhes Sobre <span class="modal-title" id="modalNameTitulo"></span> </h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="d-flex align-items-center"> <!-- Flexbox container para imagem, nome e preço -->
                            <img id="modalImage" src="" alt="" class="img-fluid modal-image mr-3">
                            <div>
                                <div id="modalName"></div>
                                <div id="modalPrice"></div>
                            </div>
                        </div>
                        <div id="modalDescricao"></div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                        <form action="/add-to-sacola" method="post">
                            <input type="hidden" name="idProdutoSacola" id="idProdutoSacola">
                            <input type="hidden" id="quantidade" name="quantidade" value="1">
                            <button type="submit" class="btn btn-primary">Adicionar a Sacola</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    <%@ include file="/Componentes/rodape.jsp" %>


    <script>

        function openModal(name, image, price, descricao, id) {
            document.getElementById('modalNameTitulo').innerText = name;
            document.getElementById('modalName').innerText = name;
            document.getElementById('modalImage').src = '../../img/' + image;
            document.getElementById('modalPrice').innerText = 'R$ ' + price;
            document.getElementById('modalDescricao').innerText = descricao;
            document.getElementById('idProdutoSacola').value = id;

        }
    </script>

</body>
</html>