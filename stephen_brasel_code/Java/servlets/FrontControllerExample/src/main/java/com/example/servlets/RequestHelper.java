package com.example.servlets;

import com.example.controllers.HomeController;
import com.example.controllers.LoginController;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

	public static String process(HttpServletRequest req){

		String ret = ("THIS is the current URI active: " + req.getRequestURI());

		switch(req.getRequestURI()){
			case "/FrontControllerExample/html/login": case "/FrontControllerExample/api/login":
				System.out.println("in login case");
//				return "/html/login.html";
				return LoginController.login(req);
			case "/FrontControllerExample/html/home": case "/FrontControllerExample/api/home":
				System.out.println("in home case");
//				NOT modularized
//				return "/html/home.html";

				//modularized
				return HomeController.home(req);
			default:
				System.out.println("in default");
				return "/html/badlogin.html";
		}
//		System.out.println(ret);
//		return "/html/home.html";
	}
}
