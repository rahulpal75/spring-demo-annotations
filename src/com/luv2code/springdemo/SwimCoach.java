package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
   /* @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
   /* @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 30 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }*/
   private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
