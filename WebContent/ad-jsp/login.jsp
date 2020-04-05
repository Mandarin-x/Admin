<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>

<!--Luo Xue-->
<html>
  <head>
    <title>login</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
      <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
<link rel="stylesheet" type="text/css" href="../css/css.css">
  </head>
  <body>

 <div class="container">
            <div class="heading"><!--页眉内容-->
                <div class="heading_nav"><!--这里是导航栏内容,要加啥功能模块往这里放-->
                    <div class="heading_logo"><img src="../images/logo.png" height="153" width="279"/></div>
             
                </div>
            </div>
   <div class="body"> 
      	<form name="form1" action="${pageContext.request.contextPath }/login" method="post">
     		 <h1>Book management system</h1>
            <input class=input_1 id=username size=15  name="id"  placeholder=username><br />
          	<input class=input_1 id=password type=text size=15 name="pwd" placeholder=password><br />

            <br/>
            <input class=input_3 type="submit" value="login" /><!--提交表单数据-->
            <input class=input_3 type="button"  onclick=document.form1.reset() value="reset" /> <!--reset-->
     	</form>
        <script type="text/javascript" src="../js/script.js"></script>  
        
 </div><!--这是数据块-->
<div class="footing"></div>
 <div class="foot_font">Copyright © 2020 Mandarin C2. All rights reserved.</div>
</div>
  </body>

</html>

