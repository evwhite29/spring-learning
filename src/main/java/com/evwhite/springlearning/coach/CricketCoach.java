package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getDailyWorkout() {
        return "Crack that ball with that weird bat.";
    }

    public String getDailyFortune() {
        return "For cricket: " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
