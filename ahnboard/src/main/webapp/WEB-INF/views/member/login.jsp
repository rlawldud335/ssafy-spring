<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./login" method="post">
<table id="customers">
  <tr>
    <th>아이디</th>
    <td><input type="text" name="userId"> </td>
  </tr>
  <tr>
    <th>패서워드</th>
    <td><input type="text" name="userPwd"> </td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" value="로그인"> </td>
  </tr>
</table>
</form>
<a href='./regist'>회원가입</a>
</body>
</html>