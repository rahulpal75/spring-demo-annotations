package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappuFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is lucky day.";
    }

}
