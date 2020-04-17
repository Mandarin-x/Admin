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
<title>set deposit result</title>
<script>
				function isSuccess(flag) {
					if(flag==true){
						alert("set successful!");
					}else if(flag==false){
						alert("set failed!");
					}
					window.location.href = "AdSetDeposit.htm";
				}
			</script>

</head>
<body>
	
			<script>
			isSuccess(${flag});
			</script>
	

</body>
</html>