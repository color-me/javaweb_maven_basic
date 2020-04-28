<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>修改用户</title>
</head>
<body>

<h1>修改用户</h1>

<form action="mod" method="post">
    id：<input type="text" name="id" value="${modifyUser.id}" readonly /><br>
    用户名：<input type="text" name="name" value="${modifyUser.name}" /><br>
    密码：<input type="password" name="password" value="${modifyUser.password}" /><br>
    性别：<input type="radio" name="sex" value="男" ${modifyUser.sex.equals("男")?"checked":""} />男
    <input type="radio" name="sex" value="女" ${modifyUser.sex.equals("女")?"checked":""} />女<br>
    爱好：<input type="checkbox" name="hobby" value="吃饭" ${modifyUser.hobby.contains("吃饭")?"checked":""} />吃饭
    <input type="checkbox" name="hobby" value="睡觉" ${modifyUser.hobby.contains("睡觉")?"checked":""} />睡觉
    <input type="checkbox" name="hobby" value="打游戏" ${modifyUser.hobby.contains("打游戏")?"checked":""} />打游戏
    <input type="checkbox" name="hobby" value="吃零食" ${modifyUser.hobby.contains("吃零食")?"checked":""} />吃零食<br>
    <input type="submit" value="确定" /><br>
    <input type="reset" value="重置" /><br>
</form>


</body>
</html>
