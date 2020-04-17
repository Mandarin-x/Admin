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
<title>edit result</title>

<script>
				function isSuccess(i) {
					if(i==1){
						alert("edit successful!");
					}else if(i==0){
						alert("edit failed!");
					}else if(i==-1){
						alert("the requirement doesn't exist!");
					}else if(i==-2){
						alert("password is not the same as requirement!");
					}
					window.location.href = "AdDisplayRe.htm";
				}
			</script>

</head>
<body>
	<script>
isSuccess(${i });
</script>
</body>
</html>