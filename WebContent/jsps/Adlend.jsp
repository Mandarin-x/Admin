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
    <link rel="stylesheet" type="text/css" href="css/AdSetReturnPeriod.css">
</head>
<body>

<div class="container">
    <div class="heading">
        <div class="heading_nav"><

            <div class="heading_logo"><img src="images/logo.png" height="153" width="279"/></div>
            <ul>
                <div class="welcome">Welcome,Admin System</div>
                <nav>
                    <ul class="level">
                        <li><a href="jsps/Adlogout.jsp">LOG OUT</a> </li>
                        <li><a href="">FUNCTION</a>
                            <ul class="two">
                                <li><a href="AdSetFine.htm">set fine</a></li>
                                <li><a href="AdSetReturnPeriod.htm">return period</a></li>
                                <li><a href="AdDisplayLi.htm">display&delete librarian</a></li>
                                <li><a href="AdSetDeposit.htm">set deposit</a></li>
                                <li><a href="AdDisplayRe.htm">edit librarian</a></li>
                                <li><a href="./jsps/AdRegister.jsp">register librarian</a></li>
                                

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

