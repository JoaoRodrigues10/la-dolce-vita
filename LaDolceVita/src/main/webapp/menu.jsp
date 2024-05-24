<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <link  rel="stylesheet"href= "/css/menu.css">
    <link  rel="stylesheet"href= "/Componentes/cabecalho.css">
    <title>Menu</title>
</head>

<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>
<div class="row">
                                          <div class="col">
                                                           <nav aria-label="breadcrumb">
                                                             <ol class="breadcrumb">
                                                               <li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
                                                               <li class="breadcrumb-item active" aria-current="page">Menu</li>
                                                             </ol>
                                                           </nav>
                                           </div>
                                          <div class="col-md-auto"></div>

                                  <div class="col col-lg-1">
                                       <c:if test="${sessionScope.loggedUser != null}">
                                           <span>${sessionScope.loggedUser}</span>
                                           <a href="/logout">Logout</a>
                                       </c:if>
                                  </div>
    <div class="titulo">MENU</div>

    <div class="conteudo">
        <div class="parte1">
            <a href="/find-all-categorias?categoria=Bolo">
                <div class="box-bolo">
                    <div class="bolos">BOLOS</div>
                </div>
            </a>
            <a href="/find-all-categorias?categoria=Torta">
                <div class="box-torta">
                    <div class="tortas">TORTAS</div>
                </div>
            </a>
            <a href="/find-all-categorias?categoria=Gateau">
                <div class="box-gateau">
                    <div class="gateaus">GATEAUS</div>
                </div>
            </a>
        </div>
        <div class="parte2">
            <a href="/find-all-categorias?categoria=DOCE">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="/find-all-categorias?categoria=BEBIDA">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="/find-all-categorias?categoria=SALGADO">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
        </div>
    </div>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>