<!-- 测试版 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
    <link rel="stylesheet" type="text/css" href="css/AdSetDeposit.css">
    <meta charset="UTF-8">
    <title>set deposit</title>

    <script>
        function check(){
            var deposit = form1.deposit.value;
            if(!(/^[0-9]*$/.test(deposit))){
                alert("please use number");
                return false;
            }else{
            	location.href = "AdSetDepositre.htm?deposit=" + deposit;
            }
        }
    </script>

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
                                <li><a href="">back to lend&return</a></li>

                            </ul>
                        </li>

                    </ul>
                </nav>
            </ul>
        </div>
    </div>
    <div class="body">

        </br></br>

        current deposit:${olddeposit }<br>
        <form name="form1"  method="post" action="AdSetDepositre.htm" onsubmit="check()">

            <input class="input_1" name="deposit" type="text"  placeholder="deposit" required="required">
            </br></br>

            <input class="input_3" type="button" value="set" onclick="check()">

        </form>
    </div>
    
    

    <div class="footing"></div><!--页脚内容-->
    <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
</div>
</body>
</html>