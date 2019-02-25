<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="/JSP_Servlet_CRUD/JoinController" method="post">
		id: <input type="text" name="id" id="id"><br />
		pwd:<input type="password" name="pwd"><br /> 
		name:<input	type="text" name="name"><br /> 
		email:<input type="text"name="email"><br /> 
		<input type="reset" value="취소">
		<input type="submit" value="가입"> <br />
	</form>
</body>
</html>



