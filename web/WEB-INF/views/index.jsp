<%--
  Created by IntelliJ IDEA.
  User: Stein
  Date: 28/08/2016
  Time: 02:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testolino</title>
</head>
<body>
    <form action="save.html" method="post">
        Nome: <input value="teste" type="text" name="name" ><br>
        cpf: <input value="12331241" type="text" name="cpf">
        Login: <input value="will" type="text" name="login">
        senha: <input value="1234" type="password" name="password">
        email: <input value="willianw94@hotmail.com" type="email" name="email">
        <br>
        <button type="submit" name="enviar">enviar</button>
    </form>
</body>
</html>
