<%--
  Created by IntelliJ IDEA.
  User: d.mashkov
  Date: 28.07.2015
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<header>
    <title>Login page</title>
</header>
<body>
Test Page <br />
<form action="./j_spring_security_check" method="GET">
    Enter login and password: <br />
    <p>Login: <input type="text" name="j_username" size="40"/><br />
    <p>Password: <input type="password" name="j_password" /><br />
    <p><input type="submit" value="submit"></p>
</form>
</body>

</html>