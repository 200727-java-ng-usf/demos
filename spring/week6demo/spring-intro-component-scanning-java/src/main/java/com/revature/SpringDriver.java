package com.revature;

import com.revature.config.AppConfig;
import com.revature.models.Coach;
import com.revature.models.CodeCoach;
import com.revature.models.FootballCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringDriver {

	public static void main(String[] args) {
		System.out.println("Creating bean container");

		try (AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class)){

			System.out.println("Bean container created!");

			// Retrieve a bean from the container with the name "myCoach"
			Coach coach = container.getBean("myCoach", Coach.class);

			//Call some methods on the retrieved bean to ensure it is configured properly.

			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getMotivation());

			// ------------------------------------------------- //

			// Attempt to get an assistant coach
			Coach assistantCoach = container.getBean("myCoach", Coach.class);
			System.out.println(coach == assistantCoach);
			System.out.println(coach.getMotivationService() == assistantCoach.getMotivationService());

			// ------------------------------------------------- //

			FootballCoach footballCoach = container.getBean("footballCoach", FootballCoach.class);
			System.out.println(footballCoach.getDailyWorkout());
			System.out.println(footballCoach.getMotivation());
			System.out.println(footballCoach.getTeamName());
			System.out.println(footballCoach.getEmail());

			// ------------------------------------------------- //

			CodeCoach codeCoach = container.getBean("codeCoach", CodeCoach.class);
			System.out.println(codeCoach.getDailyWorkout());
			System.out.println(codeCoach.getMotivation());
		} catch(Exception e) {
		    e.printStackTrace();
		}
	}

}
