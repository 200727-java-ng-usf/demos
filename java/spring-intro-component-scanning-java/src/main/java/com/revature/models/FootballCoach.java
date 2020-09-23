package com.revature.models;

import com.revature.services.CodeMotivationService;
import com.revature.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FootballCoach implements Coach {

    @Value("${coach.email}")
    private String email;

    @Value("The Cafebabes")
    private String teamName;

    private MotivationService motivationService;

    public FootballCoach() {
        System.out.println("Football Coach no-args constructor invoked!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }

    // Setter-based dependency injection (Spring recommends this for OPTIONAL depenedencies)
    @Autowired
    public void setMotivationService(MotivationService sportMotivationService) {
        System.out.println("FootballCoach.setMotivationService() invoked!");
        this.motivationService = motivationService;
    }

    @PostConstruct
    private void customInit() {
        System.out.println("FootballCoach customInit() invoked!");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("FootballCoach.customDestroy() invoked!");
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Suicide runs to 40, 50, 60, 70, 80, 100 yard lines";
    }

    @Override
    public String getMotivation() {
        return "The football coach says: " + motivationService.getMotivation();
    }
}
