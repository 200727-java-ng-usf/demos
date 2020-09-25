package com.revature.quizzard.web.controllers;

import com.revature.quizzard.services.UserService;
import com.revature.quizzard.web.dtos.Credentials;
import com.revature.quizzard.web.dtos.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;

@RestController // convenience
@RequestMapping("/auth")
public class AuthController {

    private UserService userService;

    @Autowired
    public AuthController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Principal authenticate (@RequestBody Credentials creds, HttpServletRequest req) { // Spring gives a proxy of the req
        Principal payload = userService.authenticate(creds);
        HttpSession userSession = req.getSession();
        userSession.setAttribute("principal", payload);
        return payload;
    }

}
