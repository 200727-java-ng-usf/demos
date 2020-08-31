package com.revature.model.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ForwardingMasterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //req.getRequestDispatcher(("String").process(req)).forward(req,resp);

        req.getRequestDispatcher(RequestHelper.process(req)).forward(req,resp);

        //resp.getWriter().write("in get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().write("in post");
        req.getRequestDispatcher(RequestHelper.process(req)).forward(req,resp);
    }
}
