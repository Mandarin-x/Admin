<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" >
<!DOCTYPE html>
<html lang="en">
<!--Luo Xue-->
<head>
    <meta charset="UTF-8">
    <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="css/ad.css"><!--css文件链接位置-->

</head>
<body>
<div class="container">
    <div class="heading"><!--页眉内容-->
        <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
            <div class="heading_logo"><img src="images/logo.png" height="153" width="279"/></div>
            <ul>
                <div class="welcome">Welcome,Admin System</div><!--XXX填是什么系统，例如Admin-->
                <nav>
                    <ul class="level">
                        <li><a href="jsps/Adlogout.jsp">LOG OUT</a> </li>
                    </ul>
                </nav>
            </ul>
        </div>
    </div>
    <div class="body">
        <div class="middle_img"><img src="images/home.png" height="150" width="179"/> Admin</div>
        <a href="jsps/Adlend.jsp"> <button class="button" style="vertical-align:middle"><span>Librarian Manage</span></button></a>
        <a href="AdDisplayLi.htm"> <button class="button" style="vertical-align:middle"><span>Lend&Return Manage</span></button></a>
        <a href="jsps/AdChangePwd.jsp"><button class="button" style="vertical-align:middle"><span>Change password</span></button></a></a>

    </div>
    <!--这是数据块-->
    <div class="footing"></div><!--页脚内容-->
    <div class="foot_font">Copyright  2020 Mandarin C2. All rights reserved.</div>
</div>
</body>
</html>