package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Beware of the wolf", "Dilligence is the mother ",
            "the journey is the reward"};
    private Random myRandom = new Random();


    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
