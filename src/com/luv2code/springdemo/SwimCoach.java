package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${foo.email}")
    public String email;

    @Value("${foo.team}")
    public String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice back stroke";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
