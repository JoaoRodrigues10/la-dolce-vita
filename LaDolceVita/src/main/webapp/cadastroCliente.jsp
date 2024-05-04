<html>
    <body>
        <h2>Cadastra-se</h2>

        <form action="/create-cliente" method="post">
            <label>*E-mail</label>
            <input type="text" name="email" id="email" value="${param.email}">
            <input type="hidden" id="id" name="id" value="${param.id}">
            <label>*CPF</label>
            <input type="text" name="cpf" id="cpf" value="${param.cpf}">
            <label>*Nome</label>
            <input type="text" name="nome-cliente" id="nome-cliente" value="${param.nome}">
            <label>*Data de Nascimento</label>
            <input type="text" name="data-nascimento" id="data-nascimento" value="${param.data}">
            <label>*Celular</label>
            <input type="text" name="celular" id="celular" value="${param.celular}">
            <label>*Senha</label>
            <input type="text" name="senha" id="senha" value="${param.senha}">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>