<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: SHIVAM
  Date: 21-02-2019
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlets</title>
</head>
<body>


<%--use scriptlets as follows--%>

<% String languages[]={"C","C++","C#","JAVA","JavaScript","Python"}; %>

<% Date date= new Date(); %>

<h2> <%= date.getTime() %> </h2>
<ul>
    LANGUAGES :
    <% for(String s:languages) {%>
    <li>
        <%= s%>
    </li>

    <% } %>
</ul>
</body>
</html>
