<%--
  Created by IntelliJ IDEA.
  User: 罗彬的电脑
  Date: 2022/5/7
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import=" Util.Dept" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>firstPage</title>
</head>
<body>
<%
    List<Dept> depts=(List<Dept>)request.getAttribute("depts");
    for (Dept dept:depts) {
%>
        <tr>
	<td><%=dept.getNumber()%></td>
   	<td><%=dept.getName()%></td>
  	<td><%=dept.getLocation()%> </td>
 	<td>
        		<a href=''>删除</a>
        		<a href=''>修改</a>
        		<a href='" + request.getContextPath() + "/dept/detail?deptNumber=" + number + "'>详情</a>
       	</td>
    </tr>
    <%
        }
    %>



</body>
</html>
