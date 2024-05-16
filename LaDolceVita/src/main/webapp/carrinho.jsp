<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"href= "/css/carrinho.css">
    <link rel="stylesheet"href= "/css/rodape.css">
    <title>Doces</title>
</head>

<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>

    <div class="titulo">CARRINHO</div>

    <div class="conteudo">
        <table>
            <thead>
                <tr>
                    <th style="text-align: left;">PRODUTO</th>
                    <th>PREÇO</th>
                    <th>QUANTIDADE</th>
                    <th>TOTAL</th>
                    <th>REMOVER</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <div class="detalhe">
                            <img src="/img/bolo.jfif" class="img">
                            <div class="info">
                                <div class="info-produto">Nome do Produto</div>
                                <div>Descrição do Produto</div>
                            </div>
                        </div>
                    </td>

                    <td>R$ 50,00</td>

                    <td>
                        <button class="qtd-bot">-</button>
                        <span>1</span>
                        <button class="qtd-bot">+</button>
                    </td>

                    <td>R$ 50,00</td>

                    <td><button class="remover">X</button></td>
                </tr>

            </tbody>
        </table>

        <div class="titulo">RESUMO DA COMPRA<br>PRECISO TERMINAR</div>

        <div class="box">
            <div class="parte1">
                <div class="">
                    <div class="desc">Sub-total</div>
                    <div class="result"></div>
                </div>
                <div class="par">
                    <div class="desc">Frete</div>
                    <div class="result"></div>
                </div>
                <div class="par">Adicionar cupom de desconto</div>
            </div>
            <div class="parte2">
                <div class="desc">Total</div>
                <div class="result">R$ 780,00</div>
            </div>
        </div>

    </div>

    <%@ include file="/Componentes/rodape.jsp" %>

</body>
</html>