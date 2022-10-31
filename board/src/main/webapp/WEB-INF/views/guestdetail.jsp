<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
	<title>GuestBooks</title>
</head>
<c:if test="${not empty login}">
[${login.userName }]님 반갑습니다. 
<a href='./guestlist'>게시판 보기</a>
<a href='./guestwrite'>게시판 글쓰기</a>
<a href='./logout'>로그아웃</a>
</c:if>

<body>
<h1>
	안녕하세요 인재 게시판입니다.
</h1>

<form action="./guestupdate" method="post" accept-charset="UTF-8">
<input type="hidden" name="articleNo" value="${book.articleNo}">
<table id="customers">
  <tr>
    <th>작성자</th>
    <td>${book.userId}</td>
  </tr>
	<tr>
    <th>제목</th>
    <td><input type="text" name="subject" value="${book.subject}"></td>
  </tr>  
  <tr>
    <th>내용</th>
    <td><textarea rows="20" cols="50" name="content">${book.content}</textarea></td>
  </tr>
  <tr>
  	<td colspan="2"><input type="submit" value="subject" value="수정하기"></td>
  </tr>
</table>
</form>

<a href="./">HOME</a>
<a href="./guestlist">게시판 보기</a>
<a href="./guestwrite">게시판 글쓰기</a>
</body>
</html>