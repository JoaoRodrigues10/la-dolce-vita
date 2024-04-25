<html>
    <body>
        <h2>Novo Produto</h2>
        <form action="/create-produto" method="post">
            <label>Nome do Produto</label>
            <input type="text" name="name-produto" id="name-produto" value="${param.name}">
            <input type="hidden" id="id" name="id" value="${param.id}">
            <button type="submit">Save</button>
        </form>
    </body>
</html>