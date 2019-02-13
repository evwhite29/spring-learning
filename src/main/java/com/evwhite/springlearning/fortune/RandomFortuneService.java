package com.evwhite.springlearning.fortune;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Qualifier("randomFortune")
public class RandomFortuneService implements FortuneService {

    private static final List<String> fortunes = Arrays.asList("You're lucky", "You suck", "I don't care");

    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
