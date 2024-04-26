<!DOCTYPE html>
<html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <head>
        <meta charset="UTF-8">
        <title>Dashboard</title>
    </head>

    <body>
      <div>
        <h1>Produtos</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Categoria</th>
                <th>Descrição</th>
                <th>Preço</th>
            </tr>
                <tr>
                    <c:forEach var="produto" items="${produtos}">
                    <td>${produto.id}</td>
                    <td>${produto.name}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.preco}</td>
                    <td>
                        <form action="/delete-produto" method="post">
                            <input type="hidden" id="id" name="id" value="${produto.id}">
                            <button type="submit">Delete</button>
                            <span> | </span>
                            <a href="index.jsp?id=${produto.id}&name=${produto.name}">Update</a>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
      </div>
    </body>
</html>