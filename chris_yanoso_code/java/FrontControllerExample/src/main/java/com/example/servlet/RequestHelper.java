package com.example.servlet;

import com.example.controller.HomeController;
import com.example.controller.LoginController;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {

    public static String process(HttpServletRequest req){

        System.out.println("This is the current URI active: " + req.getRequestURI());


        switch(req.getRequestURI()){
            case "/controller/api/login":
                System.out.println("in login case");
                //return "/html/login.html";
                return LoginController.login(req);
            case "/controller/api/home":
                System.out.println("in home case");
                //return "/html/home.html";
                return HomeController.home(req);
            default:
                System.out.println("in default");
                return "/html/badLogin.html";
        }

    }

}
