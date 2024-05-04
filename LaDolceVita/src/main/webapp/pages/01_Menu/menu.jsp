<!DOCTYPE html>
<html lang="en">
<head>
<%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet"href= "menu.css">
    <title>Menu</title>

</head>

<body>
    <%@ include file="/pages/Componentes/cabecalho.jsp" %>

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
            <img src="../img/logo.jfif" alt="">
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
            <div class="ropcoes">LOJA ONLINE</div>
            <div class="ropcoes">SOBRE</div>
            <div class="ropcoes">MINHA CONTA</div>
            <div class="ropcoes">CONTATO</div>
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