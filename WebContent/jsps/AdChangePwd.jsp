<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" >
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" type="text/css" href="css/style.css"><!--css文件链接位置-->
<title>Change Password</title>
<!--Luo Xue-->
</head>
<body>
        <div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                    
                    <div class="heading_logo"><img src="images/logo.png" height="153" width="279"/></div>
                   
                   <div class="welcome">Welcome,Admin System</div><!--XXX填是什么系统，例如Admin-->
                   <div class="heading_Sign_out"><a href="jsps/Adlogout.jsp">LOG OUT</a></div>
                </div>
            </div>
            <div class="body"> 
           

<form action="${pageContext.request.contextPath }/ChangePwd.htm" method="post">
<input class="input_1" name="id" type="text" placeholder=ID><br>
<input class="input_1" name="pwd1" type="password" placeholder=password><br>
<input class="input_1" name="pwd2" type="password" placeholder=Confirm><br>
<input class="input_3" type="submit" value="submit">


</form>



</div><!--这是数据块-->




       <div class="footing"></div><!--页脚内容-->
        <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
    </div>
    </body>
</html>