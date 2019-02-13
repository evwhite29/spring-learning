package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(@Qualifier("randomFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Jump over those hurdles 50 times.";
    }

    public String getDailyFortune() {
        return "For track: " + fortuneService.getFortune();
    }

}
