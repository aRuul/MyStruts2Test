<%--
  Created by IntelliJ IDEA.
  User: RuRu
  Date: 2020/10/18
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>test2-xmlMethod</title>
</head>
<body>
--------------通过配置XML进行数据验证,只有identify是user时才能登陆成功---------<br>

<a href="switch2.action?request_locale=zh_CN">中文</a>
<a href="switch2.action?request_locale=en_US">English</a>
<s:form action="action2" method="post">
    <s:textfield name="name" key="index.name"/>
    <s:textfield name="identify" key="index.identify"/>
    <s:submit key="index.submit" align="center"/>
</s:form>

<a href="index.jsp">返回admin登陆界面</a>
</body>
</html>
