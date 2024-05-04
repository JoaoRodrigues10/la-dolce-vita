<!DOCTYPE html>
<html lang = "en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>

    <body>
        <form action="/login" method="post">
            <span>${requestScope.message}</span>

            <br>

            <label for="email">Email</label>
            <input type="text" id="email" name="email">

            <br>

            <label for="senha">Senha</label>
            <input type="password" id="senha" name="senha">
            <button type="submit">Login</button>
            <a href="cadastroCliente.jsp">Cadastre-se</a>

        </form>

    </body>
</html>