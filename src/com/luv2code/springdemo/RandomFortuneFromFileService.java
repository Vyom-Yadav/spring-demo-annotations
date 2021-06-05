package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneFromFileService implements FortuneService {

    @Value("${RandomFortuneFromFileService.fortunes}")
    private String[] fortunes;

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
