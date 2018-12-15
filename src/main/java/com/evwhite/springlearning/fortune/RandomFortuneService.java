package com.evwhite.springlearning.fortune;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private static final List<String> fortunes = Arrays.asList("You're lucky", "You suck", "I don't care");

    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
