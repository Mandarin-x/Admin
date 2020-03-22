<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
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
<link rel="stylesheet" type="text/css" href="css/css.css">
  </head>




  <body>




<div id="Layer80"></div>


<div id="Layer90"></div>
  
      	<form name="form1" action="${pageContext.request.contextPath }/login" method="post">
     		 <h1>Book management system</h1>
            <input class=input_1 id=username size=15  name="id"  placeholder=username><br />
          	<input class=input_1 id=password type=text size=15 name="pwd" placeholder=password><br />

            <br/>
            <input class=input_3 type="submit" value="login" />
            <input class=input_3 type="button"  onclick=document.form1.reset() value="reset" /> 
     	</form>
        <script type="text/javascript" src="js/script.js"></script>  
        
  <div id="Layer130"><img src="images/logo.png" width="229" height="103"></div>
 
  <div id="Layer120"></div>





  </body>




</html>

