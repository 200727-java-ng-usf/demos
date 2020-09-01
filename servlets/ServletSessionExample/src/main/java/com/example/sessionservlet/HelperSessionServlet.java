package com.example.sessionservlet;

import com.example.model.SuperVillain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HelperSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        SuperVillain villain = (SuperVillain) session.getAttribute("currentvillian");

        PrintWriter out = resp.getWriter();
        // out.println("<html><body>");

        out.println(villain.getName());

        if(villain != null) {
            out.println("We've captured the villain!");
            out.println(villain.getName());
            out.println("<h1>Villain Name: ");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
