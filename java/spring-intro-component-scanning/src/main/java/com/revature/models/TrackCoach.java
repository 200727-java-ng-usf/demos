package com.revature.models;

import org.springframework.stereotype.Component;
import com.revature.services.*;

@Component
public class TrackCoach implements Coach {

    private MotivationService motivationService;

    // no @Autowired here because constructor-based injection
    public TrackCoach(MotivationService motivationService) {
        System.out.println("Track constructor invoked!");
        this.motivationService = motivationService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Run a 30-minute 5k";
    }

    @Override
    public String getMotivation() {
        return "The track coach says: " + motivationService.getMotivation();
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }
}
