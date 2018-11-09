package org.lanqiao.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet( "/shoppingCartServlet")
public class shoppingCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取前台传送得数组，使用  getParameterValues()  方法，得到一个 String类型的数组
        String[] strr = request.getParameterValues("selectedGoods");
        List<String> stringList = new ArrayList<>();
        for (String slist:strr){
            stringList.add(slist);
        }
        //将 stringList列表  存放到session中
        HttpSession session = request.getSession();
        session.setAttribute("stringList",stringList);
        request.getRequestDispatcher("/shoppingCart.jsp").forward(request,response);
    }
}
