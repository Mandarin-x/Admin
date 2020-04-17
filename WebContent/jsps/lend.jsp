<!DOCTYPE html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<base href="<%=basePath%>"></base>

<!--Luo Xue-->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>lend&return</title>
    <link rel="stylesheet" type="text/css" href="css/AdSetReturnPeriod.css"><!--css文件链接位置-->
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
                        <li><a href="logout.jsp">LOG OUT</a> </li>
                        <li><a href="">FUNCTION</a>
                            <ul class="two"><!--要加啥功能模块往这里-->
                                <li><a href="AdSetFine.htm">set fine</a></li>
                                <li><a href="AdSetReturnPeriod.htm">return period</a></li>
                                <li><a href="AdDisplayLi.htm">display&delete librarian</a></li>
                                <li><a href="AdSetDeposit.htm">set deposit</a></li>
                                <li><a href="AdDisplayRe.htm">edit librarian</a></li>

                            </ul>
                        </li>

                    </ul>
                </nav>
            </ul>

        </div>
    </div>
    <div class="body_1">
        <div class="middle_img"><img src="images/home.png" height="250" width="279"/> Lend&Return Management</div>

    </div>
    <!--这是数据块-->
    <div class="footing"></div>
    <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
</div>
</body>

</html>

