package com.revature.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create a way to handle forwarded requests.
 */
@WebServlet("/answer") // does the exact same thing that the logic in the web.xml does. Don't do both! Pick one or the other.
public class AnswerServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter respWriter = resp.getWriter();
        String answer = (String) req.getAttribute("answer");
        respWriter.write("<p>The answer is: " + answer + "</p>");
        respWriter.write("<br/><a href=\"index.html\">Calculate something else</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
