<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>更改密码</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/ChangePwd" method="post">
 ID:<input name="id" type="text"><br>
密码:<input name="pwd1" type="password"><br>
再次确认密码:<input name="pwd2" type="password"><br>
<input type="submit" value="提交">


</form>

</body>
</html>