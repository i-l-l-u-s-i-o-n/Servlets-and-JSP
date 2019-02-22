<%--
  Created by IntelliJ IDEA.
  User: SHIVAM
  Date: 21-02-2019
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Todos</title>
    <%--<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"--%>
          <%--rel="stylesheet">--%>

    <!-- Latest compiled and minified CSS -->
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

    <a href="/" class="navbar-brand">VISION</a>

    <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="/list_todo">Todos</a></li>
        <li><a href="http://www.github.com/shivam1097">Shivam</a></li>
    </ul>

    <ul class="nav navbar-nav navbar-right">
        <li><a href="/logout">Logout</a></li>
    </ul>

</nav>

<div class="container">
    <H1>WELCOME  ${name}</H1>

    Your ToDos are :

    <table class="table table-striped">
        <thead>
            <th>Description</th>
            <th>Category</th>
            <th>Action</th>
        </thead>

        <tbody>
        <%--           The List         element_of_list          --%>
        <%--              ^                   ^                  --%>
        <c:forEach items="${list}"         var="todo">
            <tr>
                <td>${todo.name}</td>
                <td>${todo.category}</td>
                <td><a class="btn btn-danger" href="/delete_ToDo?todo=${todo.name}&category=${todo.category}" >Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <a class="btn btn-info" href="/add_todo">ADD ToDo</a>




</div>

<footer class="footer">
    <h3>Developed by -> SHIVAM SHUKLA</h3>
</footer>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<%--<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>