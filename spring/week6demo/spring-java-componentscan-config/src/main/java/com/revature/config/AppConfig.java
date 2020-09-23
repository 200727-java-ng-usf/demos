package com.revature.config;

import com.revature.models.BaseballCoach;
import com.revature.models.Coach;
import com.revature.models.FootballCoach;
import com.revature.models.TrackCoach;
import com.revature.services.MotivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Bean("myCoach")
	@Scope("prototype")
	public Coach yourCoach(){
		return new TrackCoach(myMotivationService());
	}

	@Scope("singleton")
	@Bean
	public MotivationService myMotivationService(){
		return new MotivationService();
	}

	@Bean(initMethod = "customInit", destroyMethod = "customDestroy")
	public FootballCoach myFootballCoach(){
		FootballCoach coach = new FootballCoach();
		coach.setMotivationService(myMotivationService());
		return coach;
	}
}
