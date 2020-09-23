package com.revature.models;

import com.revature.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Lazy // this can be used to specify that a component should be lazily instantiated
@Component
public class FootballCoach implements Coach {

	// Spring can look up values for any configured property sources
	@Value("${coach.email}")
	private String email;

	// literal string injection
	@Value("The Cafebabes")
	private String teamName;

	// Use the #{} zsyntax for calculated expressions
	@Value("#{34+ 23}")
	private int someCalculatedValue;

	@Value("${coach.emailAndTeamName:defaultValue}") // specify a default value in case some key is not found by Spring
	private String emailAndTeamName;

	private MotivationService motivationService;

	public FootballCoach(){
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

	public MotivationService getMotivationService() {
		return motivationService;
	}

	public int getSomeCalculatedValue() {
		return someCalculatedValue;
	}

	public void setSomeCalculatedValue(int someCalculatedValue) {
		this.someCalculatedValue = someCalculatedValue;
	}

	public String getEmailAndTeamName() {
		return emailAndTeamName;
	}

	public void setEmailAndTeamName(String emailAndTeamName) {
		this.emailAndTeamName = emailAndTeamName;
	}

	//Setter-based injection (Spring recommends this fro Optional dependencies)
	@Autowired // @Inject(JEE annotation which is functionally similar to Spring's @Autowired)
	public void setMotivationService(MotivationService motivationService) {
		System.out.println("FootballCoach.setMotivationService invoked!");
		this.motivationService = motivationService;
	}

	@PostConstruct
	private void customInit(){
		System.out.println("FootballCoach.customInit() invoked.");
	}

	@PreDestroy
	private void customDestroy(){
		System.out.println("FootballCoach.customDestroy() invoked.");
	}

	@Override
	public String getDailyWorkout() {
		return "Today's workout: Suicide runs to 40, 50, 60, 80, 100 yard lines.";
	}

	@Override
	public String getMotivation() {
		return "The football coach says: " + motivationService.getMotivation();
	}
}
