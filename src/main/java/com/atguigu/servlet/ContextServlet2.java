package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContextServlet1", value = "/ContextServlet1")
public class ContextServlet2 extends HttpServlet {
    @Override
    //像map一样存取数据
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ServletContext context = getServletContext();
            System.out.println(getServletContext().getAttribute("key1"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
