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
        </tr>
        <c:forEach var="produto" items="${produtos}">
            <tr>
                <td></td>
                <td>${produto.name}</td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>