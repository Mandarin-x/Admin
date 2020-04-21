<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>


<!--Luo Xue-->
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="./css/AdSetReturnPeriod.css">
	<meta charset="ISO-8859-1">
	<title>Modify default book return time</title>
	<script>
            function check(){
                var time = form_1.returntime.value;
                if(!(/^[0-9]*$/.test(time))){
                    alert("please use number");
                    return false;
                }
            }
        </script>
</head>
<body>
<div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                 <div class="goback"><a href="success.jsp"><img src="./images/home.png" height="40" width="50"/></a></div>
                    <div class="heading_logo"><img src="./images/logo.png" height="153" width="279"/></div>
                    <div class="welcome">Welcome,Lend&Return Management System</div><!--XXX填是什么系统，例如Admin-->
                   <nav>
                    <ul class="level">
                        <li><a href="jsps/Adlogout.jsp">LOG OUT</a> </li>
                        <li><a href="">FUNCTION</a>
                            <ul class="two"><!--è¦åŠ å•¥åŠŸèƒ½æ¨¡å—å¾€è¿™é‡Œ-->
                                <li><a href="jsps/Adlend.jsp">back to lend&return</a></li>

                            </ul>
                        </li>

                    </ul>
                </nav>
                </div>
            </div>
            <div class="body"> 

 </br></br>
        <br><br><br><br><br><br>
        <div style="font-size: 24px">current return period:${i}</div>
        <br>
	<form name="form_1" method="get" action="">
	
	   <input class="input_1" name="returntime" type="text" value="" placeholder="Modify default book return time">
	   </br></br>
   	  
   	 <input class="input_3" type="submit"value="submit" onclick="check()">
   	 <input class="input_3"type="reset"value="reset">
   </form>
</div> 
<c:choose>
		
		<c:when test="${isitexist==0}">
			<span>=======failed=======</span>
		</c:when>
		
		<c:when test="${isitexist==1}">
			<span>=======success=======</span>
		</c:when>
		
		<c:when test="${isitexist==-1}">
			<span>=======Can not be empty=======</span>
		</c:when>
		<c:otherwise></c:otherwise>
			
	</c:choose>
  <div class="footing"></div><!--页脚内容-->
  <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
        </div>
    </body>
</html>