
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>

</head>
<body>
<tiles:insertDefinition name="template" >
    <tiles:putAttribute name="body">
        <h2>${message}</h2>
    </tiles:putAttribute>
</tiles:insertDefinition>
<%--    <titles:insertDefinition name="template">--%>
<%--        <tiles:putAttribute name="message">--%>
<%--            Hello World--%>
<%--        </tiles:putAttribute>--%>
<%--    </titles:insertDefinition>--%>
</body>
</html>


<%--<%@ page contentType = "text/html; charset = UTF-8" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>${message}</h2>--%>
<%--</body>--%>
<%--</html>--%>