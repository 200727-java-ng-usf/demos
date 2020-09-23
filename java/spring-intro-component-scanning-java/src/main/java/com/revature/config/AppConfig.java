package com.revature.config;

import com.revature.models.Coach;
import com.revature.models.FootballCoach;
import com.revature.models.TrackCoach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import com.revature.services.MotivationService;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan("com.revature") // if no package is specified, then Spring will scan the package that this class is in
public class AppConfig {



}
