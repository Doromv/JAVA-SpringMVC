<%--
  Created by IntelliJ IDEA.
  User: DoromvQAQ
  Date: 2022/3/6
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.1.1.js"></script>
      <script>
          function a(){
              $.post({
                  url:"${pageContext.request.contextPath}/a1",
                  data:{"name":$("#username").val()},
                  success:function (data,status) {
                      alert(data);
                      console.log("data="+data);
                      console.log("status="+status);
                  }
                  })
          }
      </script>
  </head>
  <body>
 <input type="text" id="username" onblur="a()">
  </body>
</html>
