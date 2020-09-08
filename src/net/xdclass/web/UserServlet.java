package net.xdclass.web;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/userServlet/login")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String userName = req.getParameter("userName");
       // userName =  new String(userName.getBytes("ISO8859-1"),"UTF-8");
        String pwd = req.getParameter("pwd");
        if(userName.equals("xdclass") && pwd.equals("123")) {
            resp.getWriter().write("登录成功");
        }else {
            resp.getWriter().write("帐号或密码错误");
        }
    }
}
