<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ljf
  Date: 12/29/20
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <C:forEach var="game" items="${games}">
        <tr>
            <td>${game.gameId}</td>
            <td>${game.gameName}</td>
            <td>${game.gameType}</td>
            <td>${game.gameCompany}</td>
            <td>${game.gameYear}</td>
        </tr>
    </C:forEach>
</table>
</body>
</html>
