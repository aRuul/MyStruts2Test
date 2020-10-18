<%--
  Created by IntelliJ IDEA.
  User: RuRu
  Date: 2020/10/2
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  -------！方法-------------------------------------<br>
  ---------admin-------
  <form action="login!adminLogin" method="post">
    account :<input name="account" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="login">
  </form>
   ------user---------
  <form action="login!userLogin" method="post">
    account :<input name="account" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="login">
  </form>

  <br>
  -------通配符* 方法-------------------------------------<br>
  <form action="login2-adminLogin" method="post">
    account :<input name="account" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="login">
  </form>
  ------user---------
  <form action="login2-userLogin" method="post">
    account :<input name="account" type="text"><br>
    password:<input name="password" type="password"><br>
    <input type="submit" value="login">
  </form>

  <br>
  -----------通过模型驱动进行参数传递-------
  <form action="login3.action" method="post">
    name:<input name="name" type="text"><br>
    <input type="submit" value="sure">
  </form>
  -----------通过对象驱动进行参数传递-------
  <form action="login4" method="post">
    name:<input name="users.name" type="text"><br>
    <input type="submit" value="sure">
  </form>
  ----------实现对2010年10月10日的数据类型向date类型的转换---------
  <form action="login5" method="post">
    data:<input name="testDate" type="text"><br>
    <input type="submit" value="sure">
  </form>
  </body>
</html>
