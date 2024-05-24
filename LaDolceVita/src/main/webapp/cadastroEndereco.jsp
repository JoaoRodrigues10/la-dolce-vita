<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link  rel="stylesheet"href= "css/menu.css">

</head>
<body>

    <div class="aviso">
        <div class="comunicado">FAÇA AGORA SEU PEDIDO ONLINE</div>
    </div>

    <div class="cabecalho">
        <div class="logo">
            <img src="/img/logo.jfif" alt="" onclick="window.location.href='/index.jsp'">
        </div>
        <div class="opcoes">
                    <a href="/index.jsp"><buttom class="btn btn-custom">INÍCIO</buttom></a>
                    <a href="/menu.jsp"><buttom class="btn btn-custom">MENU</buttom></a>
                    <a href="/index.jsp#sobre"><buttom class="btn btn-custom">SOBRE</buttom></a>
                    <a href="#rodape"><buttom class="btn btn-custom">CONTATO</buttom></a>
                </div>

        <div class="acoes">
            <a href="/menuADM.jsp"><img src="/img/lupa.png" alt=""></a>
            <a href="/login.jsp"><img src="/img/perfil.png" alt=""></a>
            <a href="/carrinho.jsp"><img src="/img/sacola.png" alt=""></a>
        </div>
    </div>
    <div class="linha"></div>

         <div class="row">

              <div class="col">
                   <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                           <li class="breadcrumb-item"><a href="index.jsp">Inicio</a></li>
                           <li class="breadcrumb-item active" aria-current="page">Editar dados</li>
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


    <div class="main-endereco">
        <div class="card-endereco">
<h2>Olá, <c:out value="${sessionScope.loggedUser}"/> Cadastrar novo Endereco</h2><br>



<div class = "bg">


                    <form class="row g-3" action="/create-endereco" method="post">

                        <div class="col-md-4">

                             <div class="textfieldd">
                                    <label for="cep" class="form-label">Cep</label>
                                        <input type="text" class="form-control" id="cep" name="cep" required>

                             </div>
                        </div>

                        <div class="col-4">
                            <div class="textfieldd">
                                <label for="cidade" class="form-label">Cidade</label>
                                    <input type="text" class="form-control" id="cidade" name="cidade" required>

                            </div>
                        </div>
                        <div class="col-md-3">
                                                    <div class="textfieldd">
                                                        <label for="estado" class="form-label">Estado</label>
                                                            <select class="form-select" id="estado" name="estado" required>
                                                              <option selected disabled value="">Choose...</option>
                                                              <option>SP</option>
                                                            </select>

                                                    </div>
                                                </div>

                         <div class="col-md-6">
                            <div class="textfieldd">
                                <label for="endereco_Rua" class="form-label">Rua</label>
                                    <input type="text" class="form-control" id="endereco_Rua" name="endereco_Rua" required>

                            </div>
                        </div>

                        <div class="col-md-2">
                            <div class="textfieldd">
                                <label for="nomero" class="form-label">Número</label>
                                    <input type="text" class="form-control" id="nomero" name="numero" required>

                            </div>
                        </div>


                        <div class="col-8">
                            <div class="textfieldd">
                                 <label for="bairro" class="form-label">Bairro</label>
                                    <input type="text" class="form-control" id="bairro" name="bairro" required>

                            </div>
                        </div>




                        <div class="col-md-2">
                            <div class="textfieldd">
                                 <label for="complemento" class="form-label">Complemento</label>
                                    <input type="text" class="form-control" id="complemento" name="complemento" required>

                            </div>
                        </div>

                        <div class="col-8">
                            <div class="textfieldd">
                                 <label for="referencia" class="form-label">Referencia</label>
                                    <input type="text" class="form-control" id="referencia" name="referencia" required>
                                    <div class="invalid-feedback">
                                      Please provide a valid city.
                                    </div>
                            </div>
                        </div>

                                <div class="col-12">
                                    <button class="btn btn-custom" type="submit">Register</button>
                                    <button class="btn btn-custom" type="reset">Limpar</button>
                                </div>
        </form>
</div>
</div>

</div>


<div class="linha" id="rodape"></div>

    <div class="rodape">
        <div class="r1">
            <img src="/img/logo.jfif" alt="" onclick="window.location.href='/index.jsp'">
            <div class="icones">
                <div class="btn fundo">
                    <i class="fa-brands fa-whatsapp"></i>
                </div>
                <div class="btn fundo">
                    <i class="fa-brands fa-linkedin-in"></i>
                </div>
                <div class="btn fundo">
                    <i class="fa-brands fa-instagram"></i>
                </div>
                <div class="btn fundo">
                    <i class="fa-brands fa-facebook-f"></i>
                </div>
            </div>
            <div class="confeitaria">Desde 2000 - Confeitaria La Dolce Vita</div>
        </div>
        <div class="r2">
            <div class="rtitulo">HOME PAGE</div>
            <a href="menu.jsp"><div class="ropcoes">MENU</div></a>
            <a href="index.jsp#sobre"><div class="ropcoes">SOBRE</div></a>
            <a href="index.jsp#rodape"><div class="ropcoes">CONTATO</div></a>
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
                <a href="/perfil.jsp"><div class="info">recrutamento@ladolcevita.com.br</div></a>
            </div>
        </div>
    </div>

    <div class="aviso">
            <div class="comunicado" onclick="window.location.href='/index.jsp'">WWW.LADOLCEVITA.COM.BR</div>

        </div>
        <div class="aviso">
                <div class="comunicado">Copyright © 2024 LA DOLCE VITTA  - Desenvolvido por SenacTeam.</div>

            </div>


</body>
</html>