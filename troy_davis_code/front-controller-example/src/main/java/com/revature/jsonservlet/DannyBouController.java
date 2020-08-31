package com.revature.jsonservlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.sessionServlet.SuperVillain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DannyBouController {

    public static void dannyFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        SuperVillain danny = new SuperVillain("Danny Boy","Technopath",250_000);

        resp.getWriter().write(new ObjectMapper().writeValueAsString(danny));
    }
}
