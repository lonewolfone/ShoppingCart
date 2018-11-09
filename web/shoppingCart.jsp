<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 听音乐的酒
  Date: 2018/11/8
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车列表</title>
</head>
<body>
    <h2>我的购物车</h2>
    <%
            //从session中获取list列表
            List<String> list = (List<String>)session.getAttribute("stringList");
            for (String str:list){
                out.print(str);
            }
    %>
    <form action="/successServlet">
        收货人  ：<input type="text" name="username" value=""><br>
        联系电话：<input type="text" name="tellphone" value=""><br>
        收货地址：<input type="text" name="address" value=""><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
