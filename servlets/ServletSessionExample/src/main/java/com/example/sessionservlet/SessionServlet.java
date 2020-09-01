package com.example.sessionservlet;

import com.example.model.SuperVillain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        resp.getWriter().write("<h1>SessionServlet! doGet</h1>");
        System.out.println("in session goGet");

        SuperVillain dannyboy = new SuperVillain("Danny Boy", "Technopath", 150_000);


        session.setAttribute("currentVillian", dannyboy);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in session doPost");
    }
}
