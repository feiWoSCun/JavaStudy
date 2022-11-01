<%--
  Created by IntelliJ IDEA.
  User: 罗彬的电脑
  Date: 2022/5/6
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false" %>
<html>
  <head>
    <title>部门检索首页</title>
  </head>
  <body>
  <form action='<%=request.getContextPath()%>/dept/doServlet' method="get" >
  账号<input type='text' name='username'><br />
  密码<input type='text' name='password' /><br>
  <input type='checkbox' name='sure'  value='yes'>十天免登录
    <input type='submit' name='submit'>
  </form>
  </body>
</html>
