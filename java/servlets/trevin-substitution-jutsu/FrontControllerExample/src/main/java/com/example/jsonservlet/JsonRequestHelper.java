package com.example.jsonservlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.SuperVillain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRequestHelper {

	public static void process(HttpServletRequest req, HttpServletResponse res)
			throws JsonProcessingException, IOException {

		System.out.println(req.getRequestURI());
		
		//prune ending of URI string
		
		switch(req.getRequestURI()) {
		case "/FrontControllerExample/json/dannyboy":
			DannyBoyController.dannyFinder(req,res);
			break;
		case "/FrontControllerExample/json/mars":
			MarsController.marsFinder(req,res);
			break;
		default:
			SuperVillain nullVill = new SuperVillain(null, null, 0);
			res.getWriter().write(new ObjectMapper().writeValueAsString(nullVill));
			
		}
	}
}
