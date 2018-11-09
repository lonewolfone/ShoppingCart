<%--
  Created by IntelliJ IDEA.
  User: 听音乐的酒
  Date: 2018/11/8
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单信息</title>
</head>
<body>
    <%
            String username =(String) session.getAttribute("username");
            String tellphone =(String) session.getAttribute("tellphone");
            String address =(String) session.getAttribute("address");
    %>
    姓    名：<%=username%><br>
    联系电话：<%=tellphone%><br>
    收货地址：<%=address%><br>
    <h3>下单成功</h3>
</body>
</html>
