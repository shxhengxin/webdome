package net.xdclass.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.setCharacterEncoding("UTF-8");
        //resp.addHeader("name","java");
        //resp.addHeader("name","spring");
        resp.setHeader("age","23");
        resp.setStatus(200);*/
        resp.setHeader("Content-Type","text/html;charset=utf-8");
        String data = "小滴课堂java高级工程师成长系列";

        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] bytes = data.getBytes("UTF-8");
        outputStream.write(bytes);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
