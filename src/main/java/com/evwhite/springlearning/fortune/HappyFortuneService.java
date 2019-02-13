package com.evwhite.springlearning.fortune;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("happyFortune")
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "You're lucky and happy this time..";
    }
}
