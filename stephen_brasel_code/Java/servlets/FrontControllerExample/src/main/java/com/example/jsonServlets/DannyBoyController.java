package com.example.jsonServlets;

import com.example.models.SuperVillain;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DannyBoyController {

	public static void dannyFinder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		SuperVillain danny = new SuperVillain("Danny Boy", "Technopath", 250_000);
		resp.getWriter().write(new ObjectMapper().writeValueAsString(danny));
	}
}
