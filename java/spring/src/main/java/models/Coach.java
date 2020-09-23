package models;

import services.MotivationService;

public interface Coach {

    String getDailyWorkout();
    String getMotivation();
    MotivationService getMotivationService();

}
