package models;

import services.MotivationService;

public class FootballCoach implements Coach {

    private String email;
    private String teamName;

    private MotivationService motivationService;

    public FootballCoach() {
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

    // Setter-based dependency injection (Spring recommends this for OPTIONAL depenedencies)
    public void setMotivationService(MotivationService motivationService) {
        System.out.println("FootballCoach.setMotivationService() invoked!");
        this.motivationService = motivationService;
    }

    private void customInit() {
        System.out.println("FootballCoach customInit() invoked!");
    }

    public void customDestroy() {
        System.out.println("FootballCoach.customDestroy() invoked!");
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout: Suicide runs to 40, 50, 60, 70, 80, 100 yard lines";
    }

    @Override
    public String getMotivation() {
        return "The football coach says: " + motivationService.getMotivation();
    }

    @Override
    public MotivationService getMotivationService() {
        return null;
    }
}
