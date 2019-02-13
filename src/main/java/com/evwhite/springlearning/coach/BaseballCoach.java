package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BaseballCoach(@Qualifier("happyFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes hittin that ball son.";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
