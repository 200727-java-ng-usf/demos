package com.revature.models;

import com.revature.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CodeCoach implements Coach {

    private MotivationService motivationService;

    @Autowired // not required to put @Autowired. Qualifier says find any bean with this name; like an alias.
    public CodeCoach(@Qualifier("codeHypeService") MotivationService service) { // the term service is ambiguous (Spring can't find by type or name)
        System.out.println("CodeCoach constructor invoked");
        this.motivationService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Complete 5 medium difficulty HackerRank challenges.";
    }

    @Override
    public String getMotivation() {
        return "The code coach says: " + motivationService.getMotivation();
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService; // ensures that motivationService used is a singleton
    }
}
