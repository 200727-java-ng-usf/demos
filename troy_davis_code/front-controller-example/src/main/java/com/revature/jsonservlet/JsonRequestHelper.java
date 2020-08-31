package com.revature.jsonservlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.sessionServlet.SuperVillain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonRequestHelper {
    public static void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println(req.getRequestURI());

        switch (req.getRequestURI()){
            case "/frontex/json/dannyboy":
                DannyBouController.dannyFinder(req,resp);
                break;
            case "/frontex/json/mars":
                MarsController.marsFinder(req,resp);
                break;
            default:
                SuperVillain nullVillain = new SuperVillain(null,null,0);
                resp.getWriter().write(new ObjectMapper().writeValueAsString(nullVillain));
        }

    }
}
