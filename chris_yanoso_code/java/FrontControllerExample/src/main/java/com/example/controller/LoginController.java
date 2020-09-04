package com.example.controller;

import javax.servlet.http.HttpServletRequest;

public class LoginController {

    public static String login(HttpServletRequest req){

        if(!req.getMethod().equals("POST")){
            return  "/html/login.html";
        }

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(!(username.equals("cheese")&& password.equals("louise"))){
            return "/api/wrongcreds";
        } else {
            req.getSession().setAttribute("loggedUsername", username);
            req.getSession().setAttribute("loggedPassword", password);
            return "/api/home";
        }

    }
}
