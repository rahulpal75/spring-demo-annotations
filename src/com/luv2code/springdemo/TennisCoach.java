package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
   // private FortuneService fortuneService;
   @Autowired
   @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default constructor");
    }

    @PostConstruct
    public void doMyStartStuff() {
        System.out.println(">> tennisCoach :inside doMyStuff");
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
