package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean form the container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
