<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Spring Boot</title>
</head>
<body>
<table border="1" cellpadding="2" cellspacing="2" align="center">
    <tr>
        <td height="30">Welcome to Java Spring Clazz</td>
    </tr>
    <tr>
        <td>
            <a href="/">Home</a>
            <sec:authorize access="!hasAnyRole('ROLE_USER')">
                <a href="/login" style="margin-left: 30px">Login</a>
            </sec:authorize>
            <sec:authorize access="hasAnyRole('ROLE_USER')">
                <a href="/user" style="margin-left: 30px">Personal</a>
                <a href="/logout" style="margin-left: 30px">Logout</a>
            </sec:authorize>
        </td>
    </tr>

</table>
</body>
</html>
