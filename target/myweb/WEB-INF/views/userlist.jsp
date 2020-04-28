<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>用户列表</title>
</head>
<body>

<h1>用户列表</h1>
用户数：${userCount}
<hr>
<c:forEach items="${userlist}" var="user" varStatus="status">
    ${status.count}: ${user}
    <a href="mod?id=${user.id}">修改</a>
    <a href="del?id=${user.id}">删除</a>
    <br>
</c:forEach>

<%--<hr>--%>

<%--<%--%>
<%--    String[] arr={"111","222","333"};--%>
<%--    session.setAttribute("arr",arr);--%>
<%--%>--%>

<%--<c:forEach items="${arr}" var="s" varStatus="status">--%>
<%--    ${status.index}: ${s}<br>--%>
<%--</c:forEach>--%>

</body>
</html>
