package com.example.jsonservlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.SuperVillain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MarsController {

	public static void marsFinder(HttpServletRequest req, HttpServletResponse res)
			throws JsonProcessingException, IOException {
		
		SuperVillain mars = new SuperVillain("Mars", "Sandstorm", 400_000);
		
		res.getWriter().write(new ObjectMapper().writeValueAsString(mars));
	}
}
