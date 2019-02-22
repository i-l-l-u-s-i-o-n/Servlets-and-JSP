<%--
  Created by IntelliJ IDEA.
  User: SHIVAM
  Date: 21-02-2019
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>

<%--We have put the common part of jsp's into the header , footer and navigation.jspf file--%>
<%--and now we are includeing them--%>
<%--jspf -> jsp fragments--%>
<%--we can also do it for all the jsp's--%>
<%--but here we are doing it only for login.jsp to show this functionality--%>
<%@include file="../common/header.jspf"%>
<%@include file="../common/navbar.jspf"%>


<div class="container">
    <h1>Enter your credentials: </h1>
    <form action="/login" method="POST">
        <input type="text" name="name" placeholder="Username : ">
        <input type="password" name="pw" placeholder="Password : ">
        <input type="submit">
    </form>
    <p>${Error}</p>

</div>


<%@include file="../common/footer.jspf"%>

