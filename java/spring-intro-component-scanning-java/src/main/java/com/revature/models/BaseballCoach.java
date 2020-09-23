package com.revature.models;

import com.revature.services.MotivationService;
import com.revature.services.SportMotivationService;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    private MotivationService motivationService;

    // tight coupling below. No!
//    private MotivationService motivationService = new MotivationService();

    public BaseballCoach(SportMotivationService motivationService) {
        System.out.println("BaseballCoach no-args constructor invoked!");
        this.motivationService = motivationService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Spend 30 minutes on batting practice.";
    }

    @Override
    public String getMotivation() {
        return "The baseball coach says: " + motivationService.getMotivation();
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }
}
