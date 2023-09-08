
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Login </title>
</head>
<body>
    <div>
        <form action="/login" method="post">
            <input type="text" name="id" placeholder="아이디"> <br>
            <input type="text" name="password" placeholder="비밀번호"> <br>
            <input type="submit" value="로그인">
        </form>
    </div>
</body>
</html>
