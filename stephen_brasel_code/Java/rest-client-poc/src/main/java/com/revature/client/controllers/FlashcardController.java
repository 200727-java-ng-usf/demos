package com.revature.client.controllers;

import com.revature.client.intercom.ServiceClient;
import com.revature.client.models.Flashcard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class FlashcardController {

	private ServiceClient serviceClient;

	public FlashcardController(ServiceClient client){
		this.serviceClient = client;
	}

	@GetMapping(value = "/test")
	public String test(){
		return "application is running!";
	}

	@GetMapping
	public List<Flashcard> getCards(){
		return serviceClient.fetchCards();
	}

}
