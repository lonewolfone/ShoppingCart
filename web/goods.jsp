<%@ page import="java.util.List" %>
<%@ page import="org.lanqiao.pojo.Goods" %><%--
  Created by IntelliJ IDEA.
  User: 听音乐的酒
  Date: 2018/11/8
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品展示</title>
    <%--
        点击“加入购物车”按钮，拿到此行数据，存放到from表单中，再提交给后台
        给按钮绑定事件，需引入jquery
    --%>
    <%--引入jquery--%>
    <script src="js/jquery-1.12.4.js"></script>
    <script type ="text/javascript">
    // 当整个页面加载完成后，再去执行
        $(function () {
        // 循环给每一行button绑定事件
            $(".mygood").each(function () {
            // 干什么事
                // 获取button
                var btn = $(this).children().eq(4).children();
                // 给button绑定点击事件
                btn.bind("click", function () {
                    var id = btn.parent().parent().children("td").get(0).innerHTML;
                    var name = btn.parent().parent().children("td").get(1).innerHTML;
                    var price = btn.parent().parent().children("td").get(2).innerHTML;
                    var num = btn.parent().parent().children("td").get(3).innerHTML;
                    // 如何将选中的每行数据放到表单中   追加  保存到复选框中
                    $("#myform").append("<input type='checkbox' name='selectedGoods' checked='checked'value='"+id+"'>"+name+"<br>");
                    //当提交时获取所有得复选框(给复选框设置 name 属性)
                })
            })

            // 给提交按钮绑定事件
            $("#submit").click(function () {
                // 判断表单中复选框是否被选中，若选中(长度 > 0),则提交
                //$:表是： 该对象为一个  jQuery对象
                var  count = $("#myform").children(":checkbox").length;
                if (count > 0){
                    $("#myform").submit();
                } else {
                    alert("您还没选择商品");
                }
            })

        });
    </script>
</head>
<body>
        <h2>商品店铺</h2>
        <%
            //从request中获取 goodsList
            List<Goods> goodsList = (List<Goods>) request.getAttribute("goodsList");
        %>
        <%--商品展示表--%>
        <table border="1px" cellspacing="0px">
            <%--表头--%>
            <thead>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品单价</th>
                <th>商品数量</th>
                <th>加入购物车</th>
            </thead>
            <%--表体--%>
            <tbody>
                <%
                    //利用for()循环将商品进行展示
                    for(Goods goods:goodsList){
                %>

                <%--表行--%>
                <tr class="mygood">
                    <td><%=goods.getId()%></td>
                    <td><%=goods.getGoodsName()%></td>
                    <td><%=goods.getPrice()%></td>
                    <td><%=goods.getGoodsName()%></td>
                    <td><input type="button" value="加入购物车"></td>
                </tr>

                <%
                    }
                %>
            </tbody>
        </table>
        <h3>你选择的商品有：</h3>
        <form  action="/shoppingCartServlet" id="myform">
             <h4><input type="submit" id="submit" value="提交"><br></h4>
        </form>
</body>
</html>
