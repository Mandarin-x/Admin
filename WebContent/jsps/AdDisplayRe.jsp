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
    <meta charset="UTF-8">
    <title>Librarian Require Display</title>
    <link rel="stylesheet" type="text/css" href="css/AdDisplayLi.css">
    <script src="js/js.js"></script>
    <!--css文件链接位置-->
<script>
        function recover_(id) {

            var f = confirm("Are you sure to recover?");
            if (f) {
                location.href = "AdRecover.htm?id=" + id;
            } else {
                alert("You cancel the deletion.");
            }

        }
    </script>
</head>
<body>
<div class="container">
    <div class="heading">
        <!--页眉内容-->
        <div class="heading_nav">

            <div class="heading_logo"><img src="images/logo.png" height="153" width="279" /></div>
            <ul>
                <div class="welcome">Welcome,Admin System</div><!--XXX填是什么系统，例如Admin-->
                <nav>
                    <ul class="level">
                        <li><a href="logout.jsp">LOG OUT</a> </li>
                        <li><a href="">FUNCTION</a>
                            <ul class="two"><!--要加啥功能模块往这里-->

                                <li><a href="">back to lend&return</a></li><!--     add librarian account-->


                            </ul>
                        </li>

                    </ul>
                </nav>
            </ul>

        </div>
    </div>
    <div class="body">
        <div class="data">
          <form action="AdEditLire.htm">
                <input class="input_1" type="text" name="id" placeholder="id to be edited" required="required">
                <input class="input_1" type="text" name="password" placeholder="password" required="required">
                <input class="input_3" type="submit" value="Edit">
          </form>
            <table id="myTable">
                <tr class="header">
                    <th style="width: 25%;">ID</th>
                    <th style="width: auto;">password</th>
                    <th style="width: 20%;">state</th>
                    <th style="width: 20%;">operation</th>
                </tr>
                <c:forEach var="Re" items="${list}">
                    <tr>
                        <td>${Re.id}</td>
                        <td>${Re.password}</td>
                        <td>${Re.state}</td>
                        <td><input class="input_3" type="button"
                                   onclick="recover_('${Re.id}')" value="Recover" /></td>

                    </tr>

                    </tr>
                </c:forEach>
            </table>


        </div>


    </div>
    <!--这是数据块-->




    <div class="footing"></div>
    <!--页脚内容-->
    <div class="foot_font">Copyright © 2020 Mandarin C3. All rights
        reserved.</div>
</div>
</body>

</html>