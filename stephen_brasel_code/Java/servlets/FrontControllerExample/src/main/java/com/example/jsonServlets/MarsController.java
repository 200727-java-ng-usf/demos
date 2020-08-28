package com.example.jsonServlets;

import com.example.models.SuperVillain;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MarsController {
	public static void marsFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		SuperVillain mars= new SuperVillain("Mars", "Sandstorm", 400_000);
		resp.getWriter().write(new ObjectMapper().writeValueAsString(mars));
	}
}
