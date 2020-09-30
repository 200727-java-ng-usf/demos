package com.revature.client.controllers;

import com.revature.client.intercom.ServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class FlashcardController {

    private ServiceClient serviceClient;

    public FlashcardController(ServiceClient client) {
        this.serviceClient = client;
    }

    @GetMapping
    public String test() {
        return "application is running";
    }



}
