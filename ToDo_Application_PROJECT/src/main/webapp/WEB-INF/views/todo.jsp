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

    <a href="/" class="navbar-brand">Brand</a>

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
    <ul>
        <%--           The List         element_of_list          --%>
        <%--              ^                   ^                  --%>
        <c:forEach items="${list}"         var="todo">

            <%--&nbsp;  is used for space --%>
            <li> ${todo} &nbsp; &nbsp; <a href="/delete_ToDo?todo=${todo}" >Delete</a></li>

        </c:forEach>

    </ul>

    <form action="/add_todo" method="post">
        <input type="text" name="newToDO" placeholder="New ToDo : ">
        <input type="submit" value="Add">
    </form>

</div>

<footer class="footer">
    <p>footer content</p>
</footer>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<%--<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>