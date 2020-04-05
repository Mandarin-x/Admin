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
        <meta charset="UTF-8">
        <title>success</title>
        <link rel="stylesheet" type="text/css" href="../css/css.css"><!--css文件链接位置-->
    </head>
    <body>
        <div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                    <div class="heading_logo"><img src="../images/logo.png" height="153" width="279"/></div>            
                   <ul>
			             <div class="welcome">Welcome,Admin System</div><!--XXX填是什么系统，例如Admin-->
						 <nav>
                          <ul class="level">
                            <li><a href="logout.jsp">LOG OUT</a> </li>	                        
                            <li><a href="">Function</a>
                            <ul class="two">
                                <li><a href="ChangePwd.jsp">change password</a></li>
							    </ul>
                            </li>
                            
			             </ul>
                        </nav>
                       </ul>
                
                </div>
            </div>
   <div class="body"> 
      	
      <div class="lib">
        
        <h1><a href="librarian.jsp">Librarian</h1>
     </div>
      <div class="lend">
        
         <h1><a href="lend.jsp">Lend&Return</a></h1>
        
      </div>
 </div>
   <!--这是数据块-->
<div class="footing"></div>
 <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
</div>
  </body>

</html>

