package com.revature.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.revature.services.*;

@Component
public class FootballCoach implements Coach {

    @Value("${coach.email}")
    private String email;

    @Value("The Cafebabes")
    private String teamName;

    @Value("#{34 + 12}")
    private int someCalculatedValue;

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

    // @Inject is not a Spring annotation; it is coming from CDI specification. JEE annotation which is functionally similar to Spring's @Autowired
    // Spring is compatible with JEE. The advantage of using JEE annotations makes your application flexible if you decide not to use Spring
    @Autowired // required for setter-based injection, but not constructor-based injection
    // Setter-based dependency injection (Spring recommends this for OPTIONAL depenedencies)
    public void setMotivationService(MotivationService motivationService) {
        System.out.println("FootballCoach.setMotivationService() invoked!");
        this.motivationService = motivationService;
    }

    @PostConstruct // JEE annotation from javax, not Spring
    private void customInit() {
        System.out.println("FootballCoach customInit() invoked!");
    }

    @PreDestroy // JEE annotation from javax, not Spring
    public void customDestroy() {
        System.out.println("FootballCoach.customDestroy() invoked!");
    }

    public int getSomeCalculatedValue() {
        return someCalculatedValue;
    }

    public void setSomeCalculatedValue(int someCalculatedValue) {
        this.someCalculatedValue = someCalculatedValue;
    }

    public void setMotivationService(com.revature.services.MotivationService motivationService) {
        this.motivationService = motivationService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Suicide runs to 40, 50, 60, 70, 80, 100 yard lines";
    }

    @Override
    public String getMotivation() {
        return "The football coach says: " + motivationService.getMotivation();
    }

    @Override
    public MotivationService getMotivationService() {
        return null;
    }
}
