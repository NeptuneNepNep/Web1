package com;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewServlet", value = "/NewServlet")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取上下文配置参数
        ServletContext  context = getServletConfig().getServletContext();
        String username = context.getServletContextName();
        System.out.println(username);
        //获取工程路径 相对和绝对
        System.out.println(context.getContextPath());
        System.out.println(context.getRealPath("/css"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
