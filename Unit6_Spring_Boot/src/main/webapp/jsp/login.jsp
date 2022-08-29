<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: duong
  Date: 29/08/2022
  Time: 11:40 SA
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<tiles:insertDefinition name="template" >
    <tiles:putAttribute name="body">
        <h1>Login to Application</h1>
        <c:if test = "${not empty error}">
            <div class="error">${error}</div>
        </c:if>

        <form method="post" action="/login">
            <input type="hidden" name="{$_csrf.parameterName}" value="${_csrf.token}"/>

            <p><input type="text" name="j_username" placeholder="Username"></p>
            <p><input type="password" name="j_password" placeholder="Password"></p>

            <p><input type="submit" name="commit" value="Login"></p>
        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
