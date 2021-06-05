package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean form the container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        //Coach theCoachTwo = context.getBean("squashCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoachTwo.getDailyWorkout());
//        System.out.println(theCoach.name);
//        System.out.println(theCoach.age);
        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
