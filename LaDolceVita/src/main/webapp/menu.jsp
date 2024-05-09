<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "css/menu.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <style>
        a:link{
            color: #FFB6C1;
            text-decoration: none;
        }
        a:visited{
            color: #FFB6C1;
        }
        a:hover{
            text-decoration: underline;
            background-color: #FFE7EA;
        }


    </style>
    <title>Menu</title>
</head>

<body>
                        <div class="row">
                              <div class="col"></div>
                              <div class="col-md-auto"></div>

                              <div class="col col-lg-1">
                                   <c:if test="${sessionScope.loggedUser != null}">
                                       <span>${sessionScope.loggedUser}</span>
                                       <a href="/logout">Logout</a>
                                   </c:if>
                              </div>
                            </div>
                          </div>



    <div class="aviso">
        <div class="comunicado">FAÇA AGORA SEU PEDIDO ONLINE</div>
    </div>

    <div class="cabecalho">

        <div class="logo">
            <img src="../../img/logo.jfif" alt="">
        </div>

        <div class="menu menu-topo">
            <div class="text-center">

                <a href="index.jsp" class="btn btn btn-menu"><strong> INÍCIO</strong></a>
                <a href="menu.jsp" class="btn btn btn-menu"><strong> MENU</strong></a>
                <a href="#" class="btn btn btn-menu"><strong> SOBRE</strong></a>
                <a href="#" class="btn btn btn-menu"><strong> CONTATO</strong></a>

            </div>
        </div>
        <div class="acoes">
                        <a href="#">
                           <img src="img/png/lupa.png" alt="">
                       </a>

                       <a href="#">
                           <img src="img/png/user.png" alt="">
                       </a>

                       <a href="#">
                           <img src="img/png/sacola.png" alt="">
                       </a>

        </div>
    </div>

    <div class="linha"></div>

    <div class="titulo">MENU</div>

    <div class="conteudo">
        <div class="parte1">
            <a href="../02_Bolos/bolos.html">
                <div class="box-bolo">
                    <div class="bolos">BOLOS</div>
                </div>
            </a>
            <a href="../03_Tortas/tortas.html">
                <div class="box-torta">
                    <div class="tortas">TORTAS</div>
                </div>
            </a>
            <a href="../04_Gateaus/gateaus.html">
                <div class="box-gateau">
                    <div class="gateaus">GATEAUS</div>
                </div>
            </a>
        </div>
        <div class="parte2">
            <a href="../05_Doces/doces.html">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="../05_Doces/doces.html">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
            <a href="../05_Doces/doces.html">
                <div class="box-doces">
                    <div class="doces">DOCES</div>
                </div>
            </a>
        </div>
    </div>

    <div class="linha" id="rodape"></div>

    <div class="rodape">
        <div class="r1">
            <img src="../../img/logo.jfif" alt="">
            <div class="social-media text-center">
                <ul class="list-social-media">
                    <a class="link-social-media" href="#">

                        <li class="item-social-media">
                            <i class="fab fa-facebook-f"></i>
                        </li>

                    </a>

                    <a class="link-social-media" href="#">
                        <li class="item-social-media">
                            <i class="fab fa-google-plus-g"></i>
                        </li>
                    </a>

                    <a class="link-social-media" href="#">
                        <li class="item-social-media">
                            <i class="fab fa-linkedin-in"></i>
                        </li>
                    </a>
                </ul>
            </div>
            <div class="confeitaria">Desde 2000 - Confeitaria La Dolce Vita</div>
        </div>
        <div class="r2">
            <div class="rtitulo">HOME PAGE</div>

           <div> <a href="#" class="ropcoes">SOBRE</a></div>
           <div> <a href="#" class="ropcoes">MINHA CONTA</a></div>
            <div><a href="#" class="ropcoes">CONTATO</a></div>

        </div>
        <div class="r3">
            <div class="r3titulo">CONTATO</div>
            <div class="rcombo">
                <div class="subinfo">Delivery</div>
                <div class="info">(11) 9 9429-9161</div>
            </div>
            <div class="rcombo">
                <div class="subinfo">Eventos</div>
                <div class="info">(11) 9 9429-9161</div>
            </div>
            <div class="rcombo">
                <div class="subinfo">Trabelhe conosco</div>
                <div class="info">recrutamento@ladolcevita.com.br</div>
            </div>
        </div>
    </div>
    
    <div class="aviso">
        <div class="comunicado">WWW.LADOLCEVITA.COM.BR</div>
    </div>

</body>
</html>