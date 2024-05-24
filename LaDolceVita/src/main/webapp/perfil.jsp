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





        <div class="parte">
            <div class="subt">Endereço</div>
            <div class="fora2">
                <div class="dentro2">

                    <c:forEach var="endereco" items="${clienteAutenticado.enderecos}">
                    <div class="ent">Destinatário: <c:out value="${sessionScope.loggedUser}"/></div>
                                    <div class="produto2">
                                        <div class="descP">
                                            <div class="desp">Rua: <c:out value="${endereco.endereco_Rua}"/>, Número: <c:out value="${endereco.numero}"/></div>
                                            <div class="desp">Complemento: <c:out value="${endereco.complemento}"/></div>
                                            <div class="desp">Bairro: <c:out value="${endereco.bairro}"/></div>
                                            <div class="desp">Cidade: <c:out value="${endereco.cidade}"/> - Estado: <c:out value="${endereco.estado}"/> - CEP: <c:out value="${endereco.cep}"/></div>
                                        </div>

                                    </div>
                                    <br>
                                    <div class="linha"></div>
                                    <br>
                                </c:forEach>
                </div>
            </div>

            <div class="btm">
                              <a href="cadastroEndereco.jsp">  <button>Cadastrar Endereço</button> </a>
            </div>
        </div>

    </div>

    <%@ include file="/Componentes/rodape.jsp" %>
</body>
</html>