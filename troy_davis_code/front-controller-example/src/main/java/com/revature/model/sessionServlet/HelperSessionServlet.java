package com.revature.model.sessionServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class HelperSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //session syntax
        HttpSession session = req.getSession();
        SuperVillain villain =
                (SuperVillain) session.getAttribute("currentVillain");


        //non session syntax
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        if(villain !=null){
            out.println("Weve captured the villain");

            out.println("<h1> Villain Name" + villain.getName() + "</h1><br>");
            out.println("<h1> Villain Super Pow" + villain.getSuperPower() + "</h1><br>");
            out.println("<h1> Villain Bounty" + villain.getBounty()+ "</h1><br>");
        }else{
            out.println("Cant find any villains.....");
        }
        out.println("</body></html>");

        resp.getWriter().write("<h1>HelperSessionServlet doGet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //to invalidate a session aka delete a session
        req.getSession().invalidate();
    }
}
