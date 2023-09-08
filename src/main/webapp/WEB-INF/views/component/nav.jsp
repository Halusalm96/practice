<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="nav">
  <ul class="menu">
    <li class="menu-item">
      <a href="/"> Main </a>
    </li>
    <li class="menu-item">
      <a href="/saveMain">회원가입</a>
    </li>
    <li class="menu-item" id="login-area">
    </li>
  </ul>
</div>
<script>
  const loginArea = document.getElementById("login-area");
  const loginId = '${sessionScope.loginId}';
  console.log(loginId.length);
  if(loginId.length != 0) {
    loginArea.innerHTML = "<a herf='/logout'>로그아웃</a>";
  } else {
    loginArea.innerHTML = "<a href='/loginMain'>로그인</a>";
  }
</script>