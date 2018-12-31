package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Jump over those hurdles 50 times.";
    }

    public String getDailyFortune() {
        return "For track: " + fortuneService.getFortune();
    }

    private void startupMethod() {
        System.out.println("TrackCoach: inside startup method.");
    }

    private void cleanupMethod() {
        System.out.println("TrackCoach: inside cleanup method.");
    }
}
