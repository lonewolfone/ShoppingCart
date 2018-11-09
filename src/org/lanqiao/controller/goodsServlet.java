package org.lanqiao.controller;

import org.lanqiao.pojo.Goods;
import org.lanqiao.service.goodsService;
import org.lanqiao.service.impl.goodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/goodsServlet")
public class goodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         goodsService goodsService =  new goodsServiceImpl();

        //获取商品列表
        List<Goods> goodsList = goodsService.findAllGoods();
        //将商品列表存放到request中
        request.setAttribute("goodsList",goodsList);
        request.getRequestDispatcher("/goods.jsp").forward(request,response);
    }
}
