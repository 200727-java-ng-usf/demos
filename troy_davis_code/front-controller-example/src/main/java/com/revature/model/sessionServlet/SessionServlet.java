package com.revature.model.sessionServlet;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("doGet");
        //resp.getWriter().write("<h1>SessionServlet doGet</h1>");
        //what can we do in this method? ANYTHING
        SuperVillain dannyboy =
                new SuperVillain("Danny Boy","Technon Path",250000);
        //SESSION SYNTAX HERE
        //gives us access to the session or create a new one if not
        //req.getSession(false); will return null if there is no session, it will not create one
        HttpSession session = req.getSession(); //data stored on session, cokies from user cpu
        session.setAttribute("currentVillain", dannyboy);
        //THIS STUFF HAS NOTHING TO DO WITH SESSIONS
        System.out.println("in session do get");
        resp.getWriter().write("Danny Boy is on the Loose...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("myname");
        String superpower = req.getParameter("mysuperpower");
        int bounty = Integer.parseInt(req.getParameter("mybounty"));
        SuperVillain tempVill = new SuperVillain(name,superpower,bounty);
        HttpSession session = req.getSession();
        session.setAttribute("currentVillain",tempVill);
        PrintWriter out = resp.getWriter();
        out.println("The custom villain " + name + "is on the loose.....");
        System.out.println("in session do post");
        resp.getWriter().write("<h1>SessionServlet doPost</h1>");
    }
}
