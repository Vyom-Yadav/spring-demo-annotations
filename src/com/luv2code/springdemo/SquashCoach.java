package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice with left hand";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
