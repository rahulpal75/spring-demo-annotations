package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println( theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
