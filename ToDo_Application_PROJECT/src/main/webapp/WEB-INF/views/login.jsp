<%--
  Created by IntelliJ IDEA.
  User: SHIVAM
  Date: 21-02-2019
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    <style>
        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-default">

    <a href="/" class="navbar-brand">Brand</a>

    <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="/list_todo">Todos</a></li>
        <li><a href="http://www.github.com/shivam1097">Shivam</a></li>
    </ul>

    <ul class="nav navbar-nav navbar-right">
        <li><a href="/login">Login</a></li>
    </ul>

</nav>

<div class="container">
    <h1>Enter your credentials: </h1>
    <form action="/login" method="POST">
        <input type="text" name="name" placeholder="Username : ">
        <input type="password" name="pw" placeholder="Password : ">
        <input type="submit">
    </form>
    <p>${Error}</p>

</div>

<footer class="footer">
    <p>footer content</p>
</footer>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<%--<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>
