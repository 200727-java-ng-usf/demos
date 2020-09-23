package com.revature;

import config.*;
import com.revature.models.*;

public class SpringDriver {

    public static void main(String[] args) {

        System.out.println("Creating bean container");

        // try with resource
        try {

            System.out.println("Bean container created!");

            // Retrieve a bean from the container with the name "myCoach"
            Coach coach = container.getBean("myCoach", Coach.class);

            // Call some methods on the retrieved bean to ensure it is configured properly
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getMotivation());

            // ----------------------------------------

            // Attempt to get an assistant coach
            Coach assistantCoach = container.getBean("myCoach", Coach.class);
            System.out.println(coach == assistantCoach);
            System.out.println(coach.getMotivationService() == assistantCoach.getMotivationService());

            // ------------------------------------------

            FootballCoach footballCoach = container.getBean("myFootballCoach", FootballCoach.class);
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getTeamName());
            System.out.println(footballCoach.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

// AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)
