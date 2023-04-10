package com.iweb.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 陈郅治
 * @date 2023/3/21  20:40
 **/
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter pw = resp.getWriter();
        pw.println("<div style='color:green'>login fail!</div>");
        //页面跳转到
        req.getRequestDispatcher("/display.html").forward(req, resp);
        pw.println("<div style='color:green'>login fail!</div>");

    }
}
