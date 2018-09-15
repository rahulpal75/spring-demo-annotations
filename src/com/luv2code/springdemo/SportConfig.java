package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")

public class SportConfig {

    @Bean
    public Coach SwimCoach() {
        SwimCoach() theCoach = new SwimCoach();
    }
}
