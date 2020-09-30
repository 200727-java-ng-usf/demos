package com.revature.client.intercom;

import com.revature.client.models.FlashCard;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceClient {

    private final String API_URL = "http://localhost:5000/flashcards";
    private RestTemplate restTemplate;

    public ServiceClient(RestTemplate template) {
        this.restTemplate = template;
    }

    public List<FlashCard> fetchCards() {

        ResponseEntity<FlashCard[]> response = restTemplate.getForEntity(API_URL, FlashCard[].class);

        System.out.println(response.toString());
        System.out.println("+----------------------------+");
        System.out.println(response.getStatusCodeValue());
        System.out.println("+----------------------------+");
        System.out.println(response.getHeaders());
        System.out.println("+----------------------------+");

        if (response.getBody() == null) {
            return new ArrayList<>();
        }

        return Arrays.asList(response.getBody());

    }
}
