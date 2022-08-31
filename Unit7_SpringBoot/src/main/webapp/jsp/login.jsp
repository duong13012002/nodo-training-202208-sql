<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<tiles:insertDefinition name="template" >
    <tiles:putAttribute name="body">
        <h1>Trang Đăng Nhập</h1>
        <c:if test ="${not empty error}">
            <p>Sai tên đăng nhập hoặc mật khẩu</p>
            <div class="error">${error}</div>
        </c:if>
        <form method="post" action="/j_spring_security_check">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <p>
                <input type="text" name="j_username"
                       placeholder="Username">
            </p>
            <p>
                <input type="password" name="j_password"
                       placeholder="Password">
            </p>
            <p><input type="submit" name="commit" value="Login"></p>
        </form>
    </tiles:putAttribute>
</tiles:insertDefinition>

</body>
</html>