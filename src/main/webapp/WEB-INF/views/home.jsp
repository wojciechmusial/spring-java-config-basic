<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:url var="usersURL" value="/users"/>

<html>
<head>
    <title></title>
</head>
<body>
    <h1>Witamy na stronie internetowej</h1>

    <a href="${usersURL}">Show me users</a>
</body>
</html>
