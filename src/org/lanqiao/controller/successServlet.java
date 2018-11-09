package org.lanqiao.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = (String)request.getAttribute("username");
       String tellphone = (String)request.getAttribute("tellphone");
       String address = (String)request.getAttribute("address");
       HttpSession session = request.getSession();
       session.setAttribute("username",username);
       session.setAttribute("tellphone",tellphone);
       session.setAttribute("address",address);
       request.getRequestDispatcher("/success.jsp").forward(request,response);
    }
}
