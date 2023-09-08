<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Save</title>
</head>
<body>
<div id="section">
  <form action="/save"method="post">
    <input type="text" name="id" placeholder="아이디"> <br>
    <input type="text" name="password" placeholder="비밀번호"> <br>
    <input type="text" name="name" placeholder="이름"> <br>
    <input type="text" name="birth" placeholder="생년월일 (YYMMDD)"> <br>
    <input type="text" name="mobile" placeholder="전화번호 (000-0000-0000)"> <br>
    <input type="submit" value="가입">
  </form>
</div>
</body>
</html>
