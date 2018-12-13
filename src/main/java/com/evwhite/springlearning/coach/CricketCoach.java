package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Crack that ball with that weird bat.";
    }

    public String getDailyFortune() {
        return "For cricket: " + fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
