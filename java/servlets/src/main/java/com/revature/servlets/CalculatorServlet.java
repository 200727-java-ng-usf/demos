package com.revature.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("CalculatorServlet.doPost() invoked!");
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        System.out.println(req.getMethod());

        String op1 = req.getParameter("operand1"); // correspond exactly to names of input fields in form in HTML
        String op2 = req.getParameter("operand2");
        String op = req.getParameter("operator");
        String answer = "";

        try {

            double operand1 = Double.parseDouble(op1);
            double operand2 = Double.parseDouble(op2);

            switch(op) {
                case "add":
                    answer = "" + (operand1 + operand2); // the empty string will cause java to coerce the numbers to a string
                    break;
                case "subtract":
                    answer = "" + (operand1 - operand2);
                    break;
                case "multiple":
                    answer = "" + (operand1 * operand2);
                    break;
                case "divide":
                    answer = "" + (operand1 / operand2);
                    break;
                default:
                    // Client specified improper operator; we return a 400 (Bad Request)
                    resp.setStatus(400);
                    throw new RuntimeException("Invalid operator specified");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("answer", answer); // putting values in the request. This is a key-value pair
        RequestDispatcher dispatcher = req.getRequestDispatcher("answer"); // not the answer servlets name, but is the URI's name
        dispatcher.forward(req, resp); // a forward always maintains the original request and response objects! (redirects do not)

        // We need a forward. Can take in a request in one spot and output in another. User is unaware of this change.


    } // end doPost

}
