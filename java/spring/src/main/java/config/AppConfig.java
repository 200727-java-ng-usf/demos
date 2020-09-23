package config;

import models.Coach;
import models.FootballCoach;
import models.TrackCoach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import services.MotivationService;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan
public class AppConfig {

    @Value("${coach.email")
    private String coachEmail;

    @Bean
    @Scope("prototype")
    public Coach myCoach() {
        return new TrackCoach(myMotivationService());
    }

    @Bean
    public MotivationService myMotivationService() {
        return new MotivationService();
    }

    @Bean(initMethod="customInit", destroyMethod = "customDestroy")
    public FootballCoach myFootballCoach() {
        FootballCoach coach = new FootballCoach();
        coach.setTeamName("The CafeBabes");
        coach.setEmail(coachEmail);
        coach.setMotivationService(myMotivationService());
        return coach;
    }

}
