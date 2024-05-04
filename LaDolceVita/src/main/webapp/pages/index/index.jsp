<!DOCTYPE html>
<html >
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet" href="/pages/index/menu.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/pages/index/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>Menu</title>
</head>

<body>


<%@ include file="/pages/Componentes/cabecalho.jsp" %>

<div id="carouselExampleCaptions" class="carousel slide">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>

    <div class="carousel-inner">

        <div class="carousel-item active">
            <img src="/pages/index/img/banner.png" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block"></div>
        </div>

        <div class="carousel-item">
            <img src="/pages/index/img/banner.png" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block"></div>
        </div>

        <div class="carousel-item">
            <img src="/pages/index/img/banner.png" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block"></div>
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>

    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>

<div class="container text-center">
    <br><br>

    <div class="row">
        <div class="col">
            <h2>Horario</h2>
            <br>
            <h3><small class="text-body-secondary">TODOS OS DIAS. DAS 10H AS 22H.</small></h3>
        </div>

        <br><br><br>

        <div class="col order-5">
            <h2>DELIVERY</h2>
            <br>
            <h3><small class="text-body-secondary">Temos delivery todos os dias das 12 às 22h em todas as unidades</small></h3>
        </div>
    </div>
</div>

<br><br>

<div class="barra-topo">
    <figure class="text-center">
        <blockquote class="blockquote">
            <p>FAÇA AGORA MESMO SEU PEDIDO.</p>
        </blockquote>
    </figure>
</div>

<br><br><br>

<div class="container text-center">
    <div class="row">
        <div class="col-md-4">
            <h2> VISÃO</h2>
            <br>
            <h5>Ser reconhecida como a confeitaria referência em excelência, criatividade e sabor irresistível, proporcionando momentos de doçura e felicidade aos nossos clientes.</h5>
        </div>

        <div class="col-md-4 offset-md-4">
            <h2>MISSÃO</h2>
            <br>
            <h5>Criar e oferecer produtos de confeitaria excepcionais, utilizando ingredientes de alta qualidade, técnicas artesanais e uma dose generosa de paixão, para encantar os paladares mais exigentes e tornar cada momento especial e memorável.</h5>
            <br>
        </div>
    </div>

    <div class="row">
        <div class="col-md-8 offset-md-3">
            <h2>VALORES</h2>
            <br>
            <h5>Comprometemo-nos com qualidade em cada etapa do processo, desde a escolha dos ingredientes até a apresentação final dos produtos. Incentivamos a inovação e originalidade para surpreender nossos clientes. Amamos o que fazemos, dedicando energia para criar experiências deliciosas. Agimos com honestidade, transparência e respeito em todas as relações. Priorizamos a satisfação do cliente, buscando sempre superar expectativas.</h5>
        </div>
    </div>
</div>

<br><br><br>

<div class="row">
    <div class="col-md-2">
        <br>
        <a href=""><img src="/pages/index/img/bolo2.png" alt=""></a>
    </div>

    <div class="col-md-4 offset-md-4">
        <br><br>
        <h1>BOLO DE CHOCOLATE</h1>
        <br>
        <h5 class="text">A PARTIR</h5>

        <ul class="list-inline">
            <li class="list-inline-item display-2">R$ 61,50 </li>
            <li class="list-inline-item">/kg</li>
        </ul>

        <br>

        <p>
            <a href="#" class="btn btn-primary btn-custom">
                <strong> Compre já!</strong>
            </a>
        </p>
    </div>
</div>

<div class="barra-nossa-loja text-center">
    <div class="container text-center">
        <div class="col">
            <h2>Nossas Loja</h2>
        </div>
        <br>
        <div class="col">
            <h3>Com 3 pontos de venda espalhados por São Paulo, encontre a loja mais próxima de você!</h3>
        </div>
        <br>
        <div class="row align-items-start">
            <div class="col">
                <strong>PINHEIROS</strong>
                <BR><BR>
                Rua dos Girassóis, 123
                <br> (11) 9876-5432
                <br> <br><a href="https://www.google.com/maps/place/R.+dos+Girass%C3%B3is,+123+-+Parque+Fernanda,+S%C3%A3o+Paulo+-+SP,+05887-370/@-23.6754862,-46.7944333,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce5303659edac5:0x5d25d502d14fcef0!8m2!3d-23.6754862!4d-46.7944333?entry=ttu" class="btn btn-primary btn-maps">
                    Maps
                </a>
            </div>

            <div class="col">
                <strong>GUARULHOS</strong>
                <BR><BR>
                Avenida das Palmeiras, 456
                <br> (11) 7654-3210
                <br> <br><a href="#" class="btn btn-primary btn-maps">
                    Maps
                </a>
            </div>

            <div class="col">
                <strong>MORUMBI</strong>
                <BR><BR>
                Travessa das Acácias, 789
                <br> (11) 8765-4321
                <br> <br><a href="#" class="btn btn-primary btn-maps">
                    Maps
                </a>
            </div>
        </div>
    </div>
</div>

<div class="img-rodape">
    <img src="/pages/index/img/roda-pe.png" class="d-block w-100" alt="...">
</div>



<%@ include file="/pages/Componentes/rodape.jsp" %>

</body>
</html>