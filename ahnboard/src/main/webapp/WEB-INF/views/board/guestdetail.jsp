<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>   
<html>

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

<head>
    <title>GuestBooks</title>
</head>
<body>
<h1>
    안승사 방명록 상세보기
</h1>

<form action="${root }/guestupdate" method="post">
<table id="customers">
    <tr>
        <th>번호</th>
        <td><input type="text" name="articleNo" readonly="readonly" size="50" value="${book.articleNo }"></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><input type="text" name="userId" readonly="readonly" size="50" value="${book.userId }"></td>
    </tr>
    <tr>
        <th>제목</th>
        <td><input type="text" name="subject" readonly="readonly" size="50" value="${book.subject }"></td>
    </tr>
    <tr>
        <th>작성시간</th>
        <td>${book.regtime }</td>
    </tr>
    <tr>
        <th>내용</th>
        <td><textarea rows="20" cols="50" name="content"> ${book.content}</textarea></td>
    </tr>
    
    <c:if test="${userinfo.userId eq book.userId}">
    <tr>
        <td colspan="2"><input type="submit" value="방명록 수정"></td>
    </tr>
    </c:if>
    </table>
</form>

<a href="./">HOME</a>
</body>
</html>