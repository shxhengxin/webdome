package net.xdclass.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/session_servlet")
public class SessionServlrt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("sessionId=" + session.getId());

        System.out.println("getCreateTime=" + session.getCreationTime());

        System.out.println("isNew=" +session.isNew());

        session.setAttribute("name","小滴课堂xdclass.net");


    }
}
