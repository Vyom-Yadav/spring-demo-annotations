package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach coach2 = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coach.equals(coach2));

        context.close();
    }
}
