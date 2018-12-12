package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes hittin that ball son.";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
