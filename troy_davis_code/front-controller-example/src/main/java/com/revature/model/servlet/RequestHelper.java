package com.revature.model.servlet;

import com.revature.controller.HomeController;
import com.revature.controller.LoginController;

import javax.servlet.http.HttpServletRequest;

public class RequestHelper {
    public static String process(HttpServletRequest req){

        System.out.println("THIS IS THE CURRENT URI ACTIVE " + req.getRequestURI());

        switch (req.getRequestURI()){
            case "/frontex/api/login":
                System.out.println("in login case");
                //not modularized
                //return "/html/home.html";

                //modularized
                return LoginController.login(req);
            case "/frontex/api/home":
                System.out.println("in home case");
                //not modularized
                //return "/html/login.html";

                //modularized
                return HomeController.home(req);
            default:
                System.out.println("in login case");
                return "/html/badlogin.html";
        }

        //return "html/home.html";
    }
}
