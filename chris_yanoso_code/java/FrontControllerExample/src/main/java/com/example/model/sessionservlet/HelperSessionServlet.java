package com.example.model.sessionservlet;

import com.example.model.model.SuperVillain;

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
        //Session syntax
        HttpSession session = req.getSession();
        SuperVillain villain = (SuperVillain) session.getAttribute("currentVillain");

        //Non session syntax
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        if(villain != null) {
            out.println("We've captured the villain!");

            out.println("<h1>Villain Name: " + villain.getName() + "</h1><br>");
            out.println("<b>\tSuperPower: " + villain.getSuperPower() + "</b><br>");
            out.println("<i>\tBounty: $" + villain.getBounty() + "</i><br>");
        }else{
            out.println("Can't find any villains.....");
        }
        out.println("</body></html>");

        System.out.println("HelperSessionServlet doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //to invalidate a session is to delete it from servlet memory
        req.getSession().invalidate();

    }
}
