<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Minhas Compras</title>
    <link href="css/perfil.css" rel="stylesheet">
    <link href="/Componentes/rodape.css" rel="stylesheet">
</head>
<body>
    <%@ include file="/Componentes/cabecalho.jsp" %>

    <div class="titulo">Olá, <c:out value="${sessionScope.loggedUser}"/></div>

    <div class="conteudo">
        <div class="parte">
            <div class="subt">Meus pedidos</div>
            <div class="fora">
                <div class="desc">Número do pedido:</div>
                <div class="desc1">21834012</div>

                <div class="dentro">
                    <div class="vend">Vendido e entregue por: <b class="neg">La Dolce Vita</b></div>
                    <div class="linha"></div>
                    <div class="data">Pedido feito em: 22/02/2024</div>
                    <div class="ent">Seu produto foi entregue!</div>

                    <div class="produto">
                        <div><img src="/img/torta.jfif" alt="" class="foto"></div>
                        <div class="descP">
                            <div class="np">Nome do produto</div>
                            <div class="desp">Descrição do produto</div>
                            <div class="desp">Quantidade: 3</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="parte">
            <div class="subt">Endereço</div>
        </div>

        <div class="parte">
            <div class="subt">Meu cadastro</div>
            <form action="editar-cliente" method="post">
                <div class="partes">
                    <div class="inp">
                        <div class="descricao">E-mail:</div>
                        <div class="input2">
                            <input type="text" name="email" value="${cliente.email}" readonly>
                        </div>
                    </div>

                    <div class="inp">
                        <div class="descricao">CPF:</div>
                        <div class="input2">
                            <input type="text" name="cpf" value="${cliente.cpf}" readonly>
                        </div>
                    </div>

                    <div class="inp">
                        <div class="descricao">Nome:</div>
                        <div class="input2">
                            <input type="text" name="nome-cliente" value="${cliente.nome}" readonly>
                        </div>
                    </div>
                </div>

                <div class="partes">
                    <div class="inp">
                        <div class="descricao">Data de Nascimento:</div>
                        <div class="input2">
                            <input type="text" name="data-nascimento" value="${cliente.dataNascimento}" pattern="yyyy-MM-dd" />
                        </div>
                    </div>

                    <div class="inp">
                        <div class="descricao">Celular:</div>
                        <div class="input2">
                            <input type="text" name="celular" value="${cliente.celular}" readonly>
                        </div>
                    </div>

                    <div class="inp">
                        <div class="descricao">Senha:</div>
                        <div class="input2">
                            <input type="password" name="senha" value="${cliente.senha}" readonly>
                        </div>
                    </div>
                </div>

                <div class="btm">
                    <button class="botaoA" type="submit">Editar</button>
                </div>
            </form>

        </div>

    </div>

    <%@ include file="/Componentes/rodape.jsp" %>
</body>
</html>
