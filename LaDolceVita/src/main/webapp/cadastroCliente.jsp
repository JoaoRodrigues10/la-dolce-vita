<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/login_style.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/menu.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<title>Cadastro do Cliente</title>

</head>
    <body>
    <div class="main-login">



        <div class="left-login">
            <h2 class="label"> CRIE SUA CONTA <BR> E COMPRE CONOSCO !</h2>
            <br><br>
            <a href="Home.html">
                <img class="img-logo" src="img/newlogo.png" alt="">
            </a>

            <h6 class="label"> Voltar a tela para fazer login !</h6>


            <div class="btn">
                <a href="login.jsp">
                <button class="btn-custom" type="submit">Login</button>
                </a>
            </div>

        </div>

        <div class="right-login">
            <div class="card-login">
                <h1 class="label">Cadastra-se</h1>
                <form action="/create-cliente" method="post">
                    <div class="textfield">

                    <label><h5>E-mail</h5></label>
                    <input type="text" name="email" id="email" value="${param.email}" placeholder="Digite seu e-mail">
                    <input type="hidden" id="id" name="id" value="${param.id}">
                    </div>
<br>
                    <div class="textfield">
                    <label><h5>CPF</h5></label>
                        <input type="text" name="cpf" id="cpf" value="${param.cpf}" placeholder="Digite seu CPF">
                    </div>
<br>
                    <div class="textfield">
                    <label><h5>Nome</h5></label>
                    <input type="text" name="nome-cliente" id="nome-cliente" value="${param.nome}" placeholder="Digite seu nome">
                    </div>
<br>
                    <div class="textfield">
                    <label><h5>Data de Nascimento</h5></label>
                    <input type="text" name="data-nascimento" id="data-nascimento" value="${param.data}" placeholder="Digite sua data de nasciento">
                    </div>
<br>
                    <div class="textfield">
                    <label><h5>Celular</h5></label>
                    <input type="text" name="celular" id="celular" value="${param.celular}" placeholder="Digite seu telefone">
                    </div>
<br>
                    <div class="textfield">
                    <label><h5>Senha</h5></label>
                    <input type="password" name="senha" id="senha" value="${param.senha}" placeholder="Digite sua senha">
                    </div>
<br>
                    <div class="btn">

                    <button class="btn-custom" type="submit">Cadastrar</button>
                        <button class="btn-custom" type="submit">Limpar</button>
                    </div>

            </div>
        </div>
    </div>
    </form>

    <div class="aviso">
        <div class="comunicado">WWW.LADOLCEVITA.COM.BR</div>
    </div>

    </body>
</html>