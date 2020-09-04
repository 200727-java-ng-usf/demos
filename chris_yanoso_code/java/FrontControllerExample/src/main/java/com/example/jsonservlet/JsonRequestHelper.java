package com.example.jsonservlet;

import com.example.model.model.SuperVillain;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonRequestHelper extends HttpServlet {

    public static void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(req.getRequestURL());

        switch(req.getRequestURI()){
            case "/controller/json/dannyboy":
                DannyBoyController.dannyFinder(req,resp);
                break;
            case "/controller/json/mars":
                MarsController.marsFinder(req,resp);
                break;
            default:
                SuperVillain nullVill = new SuperVillain(null, null, 0);
                resp.getWriter().write(new ObjectMapper().writeValueAsString(nullVill));
        }
    }
}
