package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"You will have a tough time today",
            "You will have a awesome day",
            "You will meet someone special today"};


    @Override
    public String getFortune() {
        int elementNo = (int) (Math.random() * 10);
        if (elementNo <= 2) {
            return fortunes[elementNo];
        } else {
            return getFortune();
        }
    }
}
