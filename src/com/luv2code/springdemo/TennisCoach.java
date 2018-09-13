package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component

public class TennisCoach implements Coach {
   // private FortuneService fortuneService;
   @Autowired
   @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default constructor");
    }
/* @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

 /*   @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");

        this.fortuneService = fortuneService;
    }*/

  /*  @Autowired
    public void doSomeTest(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");

        this.fortuneService = fortuneService;
    }*/
    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
