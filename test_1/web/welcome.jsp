<%--
  Created by IntelliJ IDEA.
  User: RuRu
  Date: 2020/10/2
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是模型驱动 Hello ! <s:property value="name"/>       <br>

这是对象驱动 姓名是：${users.name }<br>

----------实现对2010年10月10日的数据类型向date类型的转换---------<br>
<s:property value="testDate"/>
</body>
</html>
