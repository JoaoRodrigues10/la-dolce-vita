<!DOCTYPE html>
<html>
<html lang = "en">
    <head>
        <meta charset="UTF-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/login_style.css">
        <link rel="stylesheet" href="css/menu.css">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />



        <title>Login</title>
    </head>

    <body>


<div class="main-login">
    <div class="left-login">

        <h1> Faca o login para <br>E prossiga com a compra</h1>
        <a href="index.jsp">
        <img class="img-logo" src="img/newlogo.png" alt="">
        </a>
    </div>



    <div class="right-login">
        <div class="card-login">
            <h1 class="label">Login</h1>

        <form class="login" action="/login" method="post">



        <div class="textfield">
            <label for="email"><h5>Email</h5></label>
            <input type="text" id="email" name="email" placeholder="Digite seu e-mail">
        </div>
<br>

        <div class="textfield">
            <label for="senha"><h5>Senha</h5></label>
            <input type="password" id="senha" name="senha" placeholder="Digite sua senha">
           <br>
            <div class="btn">
                <button class="btn-customm" type="submit">Login</button>
                ou
                <a href="cadastroCliente.jsp">Cadastre-se</a>
            </div>
        </div>
            <span>${requestScope.message}</span>
<br>

        </form>
        </div>
    </div>
</div>




<div class="aviso">
    <div class="comunicado">WWW.LADOLCEVITA.COM.BR</div>
</div>
    </body>
</html>