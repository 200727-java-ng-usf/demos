package com.revature.models;

import com.revature.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // default name of a stereotype-annotated bean is the camelCase version of its class name ("baseballCoach")
public class BaseballCoach implements Coach {

	private MotivationService motivationService;

	//Constructor-based injection (Spring recommends this fro MANDATORY dependencies)
	@Autowired // Not required for constructor injection, spring automatically finds it.
	public BaseballCoach(MotivationService motivationService){
		System.out.println("Baseball Coach no-args constructor invoked!");
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
		return null;
	}
}
