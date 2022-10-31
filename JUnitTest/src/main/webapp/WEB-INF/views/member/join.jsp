<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Join</title>
<style>
input, select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>

	<h3>회원가입</h3>

	<div>
	  <form action="/member/join" method="post">
	  
	    <label for="userId">userId</label>
	    <input type="text" id="userId" name="userId" placeholder="userId">
	
	    <label for="userPwd">userPwd</label>
	    <input type="password" id="userPwd" name="userPwd" placeholder="userPwd">
	  
  	    <label for="userName">userName</label>
	    <input type="text" id="userName" name="userName" placeholder="userName">
	  
	    <input type="submit" value="Submit">
	  </form>
	</div>
</body>
</html>