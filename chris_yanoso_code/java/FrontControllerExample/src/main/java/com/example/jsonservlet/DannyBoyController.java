package com.example.jsonservlet;

import com.example.model.model.SuperVillain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DannyBoyController {

    public static void dannyFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        SuperVillain danny = new SuperVillain("Danny Boy", "Technopath", 250_000);

        resp.getWriter().write(new ObjectMapper().writeValueAsString(danny));
    }
}
