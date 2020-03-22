<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Search Book</title>
        <link rel="stylesheet" type="text/css" href="style.css"><!--css文件链接位置-->
    </head>
    <body>
        <div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                    <div class="heading_logo"><img src="images/logo.png" height="153" width="279"/></div>
                    <div class="heading_Sign_out"><a href="#">LOG OUT</a></div>
                </div>
            </div>
            <div class="body"> 
              <div class="data">
Admin :
<br/>
<br/>

<c:forEach items="${list}" var="ad">
		<tr>
				<th>ID：${ad.getID()}</th> 
				<th>password：${ad.getPwd()}</th>
				<th>state：${ad.getState()}</th> <br/>
		</tr>					
</c:forEach>

            </div>




            </div><!--这是数据块-->




            <div class="footing"></div><!--页脚内容-->
        </div>

	 <form action="logout.jsp">
	 	<input type="submit"value="退出">
     </form>
  </body>
</html>

