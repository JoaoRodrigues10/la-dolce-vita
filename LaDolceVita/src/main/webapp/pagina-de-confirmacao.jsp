<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confirmação de Pedido</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Olá <c:out value="${sessionScope.loggedUser}"/>, Pedido Confirmado!</h1>
        <p class="lead text-center">Obrigado por sua compra! Seu pedido foi confirmado e está sendo processado. Você receberá uma confirmação por e-mail em breve.</p>
        <p class="text-center">Número do Pedido: <strong>${idPedido}</strong></p>
        <p class="text-center">Para mais informações, entre em contato conosco.</p>
        <div class="text-center">
            <a href="/" class="btn btn-primary">Voltar para a Página Inicial</a>
        </div>
    </div>
</body>
</html>
