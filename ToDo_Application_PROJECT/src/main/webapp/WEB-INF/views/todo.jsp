<%--
  Created by IntelliJ IDEA.
  User: SHIVAM
  Date: 21-02-2019
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>WELCOME</h1>
<h2>Your ToDos are : </h2>

<%--To loop over the todos, we are using JSTL library,--%>
<%--we use the jstl tags with the prefix i.e. here it is "c" (See first line, we specified a prefix)--%>



<ul>
    <%--           The List         element_of_list          --%>
    <%--              ^                   ^                  --%>
<c:forEach items="${list}"         var="todo">

    <li> ${todo}</li>

</c:forEach>

</ul>

</body>
</html>
