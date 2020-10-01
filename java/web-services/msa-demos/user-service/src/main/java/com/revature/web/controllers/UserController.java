package com.revature.web.controllers;

import com.revature.services.UserService;
import com.revature.web.dtos.AppUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @GetMapping
    public List<AppUserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/id/{userId}")
    public AppUserDTO getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

}
