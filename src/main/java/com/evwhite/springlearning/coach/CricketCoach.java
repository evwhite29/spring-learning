package com.evwhite.springlearning.coach;

import com.evwhite.springlearning.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${first.email}")
    private String emailAddress;
    @Value("${first.team}")
    private String team;

    public String getDailyWorkout() {
        return "Crack that ball with that weird bat.";
    }

    public String getDailyFortune() {
        return "For cricket: " + fortuneService.getFortune();
    }

    @Autowired
    public void setFortuneService(@Qualifier("randomFortune") FortuneService fortuneService) {
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
