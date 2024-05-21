<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/carrinho.css">
    <link rel="stylesheet" href="/css/rodape.css">
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
                <c:set var="subtotal" value="0" scope="page"/>
                <c:forEach var="sacola" items="${sacolas}">
                    <tr>
                        <td>
                            <div class="detalhe">
                                <img src="../../img/${sacola.produto.image}" class="img" alt="${sacola.produto.name}">
                                <div class="info">
                                    <div class="info-produto">${sacola.produto.name}</div>
                                </div>
                            </div>
                        </td>
                        <td>R$ ${sacola.produto.preco}</td>
                        <td>
                            <c:choose>
                                <c:when test="${sacola.quantidade == 1}">
                                    <form action="/delete-sacola" method="post" style="display: inline;">
                                        <input type="hidden" name="idsacoladelete" value="${sacola.id}">
                                        <button class="qtd-bot" type="submit">-</button>
                                    </form>
                                </c:when>
                                <c:otherwise>
                                    <form action="/update-sacola" method="post" style="display: inline;">
                                        <input type="hidden" name="idSacola" value="${sacola.id}">
                                        <input type="hidden" name="quantidade" value="${sacola.quantidade - 1}">
                                        <button class="qtd-bot" type="submit">-</button>
                                    </form>
                                </c:otherwise>
                            </c:choose>
                            <span>${sacola.quantidade}</span>
                            <form action="/update-sacola" method="post" style="display: inline;">
                                <input type="hidden" name="idSacola" value="${sacola.id}">
                                <input type="hidden" name="quantidade" value="${sacola.quantidade + 1}">
                                <button class="qtd-bot" type="submit">+</button>
                            </form>
                        </td>
                        <td><fmt:formatNumber value="${sacola.produto.preco * sacola.quantidade}" type="currency" currencySymbol="R$"/></td>
                        <td>
                            <form action="/delete-sacola" method="post">
                                <input type="hidden" name="idsacoladelete" value="${sacola.id}">
                                <button type="button" class="btn btn-custom remover" data-bs-toggle="modal" data-bs-target="#modal-${sacola.id}">
                                    X
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="modal-${sacola.id}" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="modalLabel-${sacola.id}" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="modalLabel-${sacola.id}">ALERTA !</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                Deseja realmente remover o item do carrinho?
                                            </div>
                                            <div class="modal-footer">
                                                <button type="submit" class="btn btn-custom">Remover</button>
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </td>
                    </tr>
                    <c:set var="subtotal" value="${subtotal + (sacola.produto.preco * sacola.quantidade)}" scope="page"/>
                </c:forEach>
            </tbody>
        </table>

        <div class="titulo">RESUMO DA COMPRA</div>

        <div class="box">
            <div class="parte1">
                <div class="">
                    <div class="desc">Sub-total</div>
                    <div class="result">
                        <fmt:formatNumber value="${subtotal}" type="currency" currencySymbol="R$"/>
                    </div>
                </div>
                <div class="par">
                    <div class="desc">Frete</div>
                    <div class="result">
                        <%-- Definir o valor do frete --%>
                        <fmt:formatNumber value="10.0" type="currency" currencySymbol="R$"/>
                    </div>
                </div>
                <div class="par">Adicionar cupom de desconto</div>
            </div>
            <div class="parte2">
                <div class="desc">Total</div>
                <div class="result">
                    <%-- Calcular o total (subtotal + frete) --%>
                    <fmt:formatNumber value="${subtotal + 10.0}" type="currency" currencySymbol="R$"/>
                </div>
            </div>
        </div>
    </div>

    <div>
        <form action="/finalizar-pedido" method="post">
                <label for="idEndereco">Escolha o endereço de entrega:</label>
                <select id="idEndereco" name="idEndereco" required>
                    <!-- Iterando sobre a lista de endereços e preenchendo as opções -->
                    <c:forEach var="endereco" items="${enderecos}">
                        <option value="${endereco.id_Endereco}">
                            ${endereco.endereco_Rua}, ${endereco.numero}, ${endereco.bairro}, ${endereco.cidade}, ${endereco.estado}, ${endereco.cep}
                        </option>
                    </c:forEach>
                </select>
                <button type="submit">Finalizar</button>
            </form>
        </div>

    <%@ include file="/Componentes/rodape.jsp" %>
</body>
</html>
