<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>添加用户</title>
</head>
<body>

<h1>添加用户</h1>

<form action="add" method="post">
    用户名：<input type="text" name="name" /><br>
    密码：<input type="password" name="password" /><br>
    性别：<input type="radio" name="sex" value="男" />男
    <input type="radio" name="sex" value="女" />女<br>
    爱好：<input type="checkbox" name="hobby" value="吃饭" />吃饭
    <input type="checkbox" name="hobby" value="睡觉" />睡觉
    <input type="checkbox" name="hobby" value="打游戏" />打游戏
    <input type="checkbox" name="hobby" value="吃零食" />吃零食<br>
    <input type="submit" value="确定" /><br>
    <input type="reset" value="重置" /><br>
</form>


</body>
</html>
