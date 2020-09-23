package com.revature.models;

import com.revature.services.MotivationService;
import com.revature.services.SportMotivationService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("myCoach")
public class TrackCoach implements Coach {

	private MotivationService motivationService;


	public TrackCoach(SportMotivationService motivationService){
		System.out.println("Track Coach no-args constructor invoked!");
		this.motivationService = motivationService;
	}
	@Override
	public String getDailyWorkout() {
		return "Today's workout: Run a <30 minute 5k.";
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
