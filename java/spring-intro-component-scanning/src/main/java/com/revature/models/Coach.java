package com.revature.models;

import com.revature.services.*;

public interface Coach {

    String getDailyWorkout();
    String getMotivation();
    MotivationService getMotivationService();

}
