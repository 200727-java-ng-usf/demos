package com.example.sessionservlet;

import com.example.model.SuperVillain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //nothing to do with the server
        SuperVillain dannyboy = new SuperVillain("Danny Boy", "Technopath", 250_000);

        // Session related code
        HttpSession session = req.getSession();

        session.setAttribute("currentVillain", dannyboy);


        //nothing to do with session
        resp.getWriter().write("<h1>Danny Boy is on the loose........");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("myname");
        String superpower = req.getParameter("mysuperpower");
        int bounty = Integer.parseInt(req.getParameter("mybounty"));

        SuperVillain tempVill = new SuperVillain(name, superpower, bounty);

        HttpSession session = req.getSession();
        session.setAttribute("currentVillain", tempVill);

        PrintWriter out = resp.getWriter();
        out.println("The CUSTOM Villain " + name + " is on the lose....");

        System.out.println("in session doPost");
    }
}
