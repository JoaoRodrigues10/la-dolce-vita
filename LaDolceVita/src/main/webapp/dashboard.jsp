<!DOCTYPE html>
<html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <head>

        <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">

            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
            <link  rel="stylesheet"href= "css/dash.css">


        <title>Dashboard</title>
        <c:if test="${sessionScope.loggedUser != null}">
                    <span>${sessionScope.loggedUser}</span>
                    <a href="/logout">Logout</a>
                  </c:if>
    </head>

    <body>


    <div class="corpo">
        <div class="card">
        <h1>Produtos</h1><br>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Categoria</th>
                <th>Descricao</th>
                <th>Preco</th>
                <c:if test="${sessionScope.loggedUser != null}">
                    <th>Actions</th>
                </c:if>

            </tr>
                <tr>
                    <c:forEach var="produto" items="${produtos}">
                    <td>${produto.id}</td>
                    <td>${produto.name}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.preco}</td>

                        <c:if test="${sessionScope.loggedUser != null}">
                            <td>
                                <form action="/delete-produto" method="post">
                                    <input type="hidden" id="id" name="id" value="${produto.id}">



                                    <button type="button" class="btn btn-custom" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                                      Delete
                                    </button>

                                    <!-- Modal -->
                                    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                      <div class="modal-dialog">
                                        <div class="modal-content">
                                          <div class="modal-header">
                                            <h1 class="modal-title fs-5" id="staticBackdropLabel">ALERTA !</h1>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                          </div>
                                          <div class="modal-body">
                                            Deseja realmente deletar este Produto ?
                                          </div>
                                          <div class="modal-footer">
                                          <button class="btn btn-custom" type="submit">Delete</button>
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>

                                          </div>
                                        </div>
                                      </div>

                                    </div>



                                    <span> | </span>
                                    <a href="cadastroProdutos.jsp?id=${produto.id}&name=${produto.name}&categoria=${produto.categoria}&descricao=${produto.descricao}&preco=${produto.preco}">Update</a>
                                </form>
                            </td>
                        </c:if>
                </tr>
            </c:forEach>

        </table>

         <c:if test="${sessionScope.loggedUser != null}">
        <a href="cadastroProdutos.jsp"<button class="btn btn-custom" type="btn">Add Produto</button></a>
        </c:if>
        </div>

        </div>
        <div class="aviso">
                <div class="comunicado">WWW.LADOLCEVITA.COM.BR</div>
            </div>

    </body>

</html>