<html>
    <body>
        <h2>Novo Produto</h2>
        <form action="/create-produto" method="post">
            <label>Nome</label>
            <input type="text" name="name-produto" id="name-produto" value="${param.name}">
            <input type="hidden" id="id" name="id" value="${param.id}">
            <label>Categoria</label>
            <input type="text" name="categoria-produto" id="categoria-produto" value="${param.categoria}">
            <label>Descricao</label>
            <input type="text" name="descricao-produto" id="descricao-produto" value="${param.descricao}">
            <label>Preco</label>
            <input type="text" name="preco-produto" id="preco-produto" value="${param.preco}">

            <button type="submit">Save</button>
        </form>
    </body>
</html>