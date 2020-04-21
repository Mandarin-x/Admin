<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" >
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!--Luo Xue-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css"><!--css文件链接位置-->
<title>error</title>
</head>
<body>
        <div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                    <div class="goback"><a href="jsps/Adlogin.jsp"><img src="images/home.png" height="40" width="50"/></a></div>
                    <div class="heading_logo"><img src="images/logo.png" height="153" width="279"/></div>
                    <div class="welcome">Welcome,Admin System</div><!--XXX填是什么系统，例如Admin-->
                <div class="heading_Sign_out"><a href="jsps/logout.jsp">LOG OUT</a></div>   
                </div>
            </div>
            <div class="body"> 

<form >

<div class="text">
<div  style="font-size:30px">error ,Log in repeatedly or password wrong<br>
please login again or logout

</div>

</div>

</form>

</div><!--这是数据块-->

            <div class="footing"></div><!--页脚内容-->
         <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
        </div>
    </body>
</html>