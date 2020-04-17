<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<base href="<%=basePath%>"></base>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>recover result</title>
</head>
<body>
	<c:choose>
		<c:when test="${flag==true}">
			<script>
				function Success() {
					alert("recover successful!");
					window.location.href = "AdDisplayRe.htm";
				}
				Success();
			</script>
		</c:when>

		<c:when test="${flag==false}">
			<script>
				function Fail() {
					alert("recover failed!");
					window.location.href = "AdDisplayRe.htm";
				}
				Fail();
			</script>
		</c:when>

		<c:otherwise>
		window.location.href = "AdDisplayRe.htm";
		</c:otherwise>

	</c:choose>
</body>
</html>