<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>游戏查询</title>
</head>
<body>
<form action="find.do" method="post">
    游戏名称<input name="gameName"/><br>
    游戏类型<input name="gameType"/><br>
    发行公司<input name="gameCompany"/><br>
    发行年份<input name="gameYear"/><br>
     <input type="submit" value="Find"/>
    <a href="game.jsp">添加</a>
</form>
</body>
</html>