package com.example.servlet;

import javax.servlet.http.HttpServletRequest;

import com.example.controller.HomeController;
import com.example.controller.LoginController;

public class RequestHelper {

	public static String process(HttpServletRequest req) {
		
		System.out.println("THIS is the current URI active: " + req.getRequestURI());
		
		switch(req.getRequestURI()) {
		case "/FrontControllerExample/api/login":
			System.out.println("in login case");
			
			//NOT modularized
			//return "/html/home.html"; //better than a "break" or your money back
			
			//modularized
			return LoginController.login(req);
		case "/FrontControllerExample/api/home":
			System.out.println("in home case");
			
			//NOT modularlized
			//return "/html/login.html";
			
			//modularized
			return HomeController.home();
		default:
			System.out.println("in default");
			return "/html/badlogin.html";
		}
		
		//return "/html/home.html";
	}
}
