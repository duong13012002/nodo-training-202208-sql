<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Spring Jazz Application</title>
</head>
<body>
    <p>
    <h1>Welcome to Spring Jazz</h1>
    <p><a href="/">Trang chủ</a></p>
    <sec:authorize access="!hasAnyRole('ROLE_USER')">
        <a href="/login-form" style="margin-left: 30px">Đăng nhập</a>
    </sec:authorize>
    <sec:authorize access="hasAnyRole('ROLE_USER')">
        <a href="/nguoi-dung" style="margin-left: 30px" >NGười dùng</a>
        <a href="javascript:document.getElementById('logout').submit();" style="margin-left: 30px">Đăng xuất</a>
    </sec:authorize>
    </p>
    <form action="/j_spring_security_logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    </form>
    <tiles:insertAttribute name="body"/>
</body>
</html>
