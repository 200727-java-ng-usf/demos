package com.example.jsonservlet;

import com.example.model.model.SuperVillain;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MarsController {

    public static void marsFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        SuperVillain mars = new SuperVillain("Mars", "God of war", 1_000_000);

        resp.getWriter().write(new ObjectMapper().writeValueAsString(mars));
    }
}
