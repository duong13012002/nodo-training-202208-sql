<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <tiles:insertDefinition name="template">--%>
<%--        <tiles:insertAttribute name="body">--%>
<%--            <h2>${message}</h2>--%>
<%--        </tiles:insertAttribute>--%>
<%--    </tiles:insertDefinition>--%>

        <tiles:insertDefinition name="template">
            <tiles:putAttribute name="message">
                <h2>${message}</h2>
            </tiles:putAttribute>
        </tiles:insertDefinition>
</body>
</html>
