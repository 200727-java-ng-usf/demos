package com.revature.client.controllers;

import com.revature.client.intercom.ServiceClient;
<<<<<<< HEAD
=======
import com.revature.client.models.Flashcard;
>>>>>>> 4586ccd3d7ab6da76dd3a6433d1dd2cbac2d827c
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 4586ccd3d7ab6da76dd3a6433d1dd2cbac2d827c
@RestController
@RequestMapping("/cards")
public class FlashcardController {

    private ServiceClient serviceClient;

    public FlashcardController(ServiceClient client) {
        this.serviceClient = client;
    }

<<<<<<< HEAD
    @GetMapping
    public String test() {
        return "application is running";
    }


=======
    @GetMapping(value="/test")
    public String test() {
        return "application is running!";
    }

    @GetMapping
    public List<Flashcard> getCards() {
        return serviceClient.fetchCards();
    }
>>>>>>> 4586ccd3d7ab6da76dd3a6433d1dd2cbac2d827c

}
