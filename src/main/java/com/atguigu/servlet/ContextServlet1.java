package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet1", value = "/ContextServlet1")
public class ContextServlet1 extends HttpServlet {
    @Override
    //像map一样存取数据
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ServletContext context = getServletContext();
            context.setAttribute("key1","value1");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
