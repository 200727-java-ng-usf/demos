package com.revature.jsonservlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.sessionServlet.SuperVillain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MarsController {

        public static void marsFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            SuperVillain danny = new SuperVillain("Mars","Sandstorm",250_000);
            resp.getWriter().write(new ObjectMapper().writeValueAsString(danny));
        }

}
