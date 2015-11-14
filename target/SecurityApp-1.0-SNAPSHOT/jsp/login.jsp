<%--
  Created by IntelliJ IDEA.
  User: Resource
  Date: 14.11.2015
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form> action="./api/security/login" method="post">
    <p><b>Введите логин и пароль:</b></p>
      <input type="text" name="username"><Br>
      <input type="password" name="password"><Br>
    <p><input type="submit" name="submit" value="Войти" />
  </form>
</body>
</html>
