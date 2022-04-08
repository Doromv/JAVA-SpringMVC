<%--
  Created by IntelliJ IDEA.
  User: DoromvQAQ
  Date: 2022/3/6
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.1.1.js"></script>
    <script>
        function a1(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#name").val()},
                success:function(msg){
                    if(msg.toString()=="用户名正确"){
                        $("#userInfo").css("color","green").html(msg);
                    }else{
                        $("#userInfo").css("color","red").html(msg);
                    }
                }
            })
        }
        function a2(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"pwd":$("#pwd").val()},
                success:function (msg){
                    if(msg.toString()=="密码正确"){
                        $("#pwdInfo").css("color","green").html(msg);
                    }else{
                        $("#pwdInfo").css("color","red").html(msg);
                    }
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名：<input type="text" onblur="a1()" id="name"><span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" onblur="a2()" id="pwd"><span id="pwdInfo"></span>
</p>
</body>
</html>
