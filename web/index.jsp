<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
      <script src="jquery-1.12.4.min.js" type="application/javascript"></script>
      <script>
          $(function(){
              $("#btn1").click(function(){
                 $.ajax({
                     url:'user23.do',
                     type:'post',
                     contentType:'application/json; charset=utf-8',
                     dataType: "json",
                     data:'{"name":"lucy","age":23,"sex":true,"addr":"西安"}'
                 });
              });
          });
      </script>
  </head>
  <body>
  index.jsp
  <c:forEach items="${requestScope.addrs}" var="addr">
      ${addr}<br>
  </c:forEach>

  <input type="button" id="btn1" value="请求ajax串">
  <hr>
  <form method="post" action="login.do">
      <input name="name" value="${userPo.name}"><br>
      <input name="age" value="${userPo.age}"><br>
      <input name="sex"><br>
      <input name="addr"><br>
      <input name="likes"><br>
      <input name="likes"><br>
      <input name="email"><br>
      <input name="myUrl"><br>
      <input type="submit" value="提交">
  </form>
  <div style="color: red;">
      <ul>
          <c:forEach items="${requestScope.errors}" var="err">
              ${err.defaultMessage}<br>
          </c:forEach>
      </ul>
  </div>
  </body>
</html>
