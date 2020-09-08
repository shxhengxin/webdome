package net.xdclass.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/forward")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DispatchServlet doGet");
        req.setAttribute("name","xdclass");
        User user = new User();
        user.setHost("https://xdclass.net");
        user.setId(1);
        user.setName("老王");
        req.setAttribute("user",user);
        //req.getRequestDispatcher("/index.jsp").forward(req,resp);
        resp.sendRedirect("index.jsp");
    }
}
