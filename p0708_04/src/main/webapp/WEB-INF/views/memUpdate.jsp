<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
	</head>
	<body>
		<h2>회원정보수정</h2>
		<form action="doMember" name="frm" method="post">
			<label>id</label>
			<input type="text" name="id" value="${id}"><br>
			<label>pw</label>
			<input type="text" name="pw" value="${pw}"><br>
			<label>이름</label>
			<input type="text" name="name"><br>
			<label>번호</label>
			<input type="text" name="phone"><br>
			<label>성별</label>
			<input type="radio" name="gender" id="male" value="male">
			<label>남자</label>
			<input type="radio" name="gender" id="female" value="female">
			<label>여자</label>
			<br>
			<lable>취미</lable><br>
			<input type="checkbox" name="hobby" id="game" value="game">
			<label>게임</label>
			<input type="checkbox" name="hobby" id="run" value="run">
			<label>조깅</label>
			<input type="checkbox" name="hobby" id="swim" value="swim">
			<label>수영</label>
			<input type="checkbox" name="hobby" id="golf" value="golf">
			<label>골프</label>
			
			
			<input type="submit" value="전송">
			
			
		
		</form>
	</body>
</html>