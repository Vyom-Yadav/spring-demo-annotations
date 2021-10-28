package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("yourCustomBeanID")
@Component // Will use default bean ID, i.e. "tennisCoach"
//@Scope("prototype")
public class TennisCoach implements Coach {

    // Autowired injects dependency at the time of runtime implicitly.
    //@Autowired // Field Injection, not good, uses Java Reflection Technology.
    //@Qualifier("randomFortuneService") // Can be used to specify the
                                      // implementation to be used,
                                      // can be used with all type of injections.
                                      // You have to give bean ID
    private FortuneService fortuneService;

   /* @Value("${TennisCoach.name}") // Can be used with private fields as well.
    public String name;

    @Value("${TennisCoach.age}")
    public int age;*/

    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside Default constructor");
    }

    @Autowired // This will automatically search the package for required bean,
               // over here it will search for the class that implements
               // the interface we have mentioned
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*@Autowired
    public void setFortuneService(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println(">> Tennis Coach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired // With Autowired you can use any method for injection
    public void doCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> Tennis Coach: inside doCrazyStuff() method");
        this.fortuneService = fortuneService;
    }*/

    @PostConstruct
    public void printPostConstruct() {
        System.out.println("@PostConstruct Annotation");
    }

    @PreDestroy
    public void printPreDestroy() {
        System.out.println("@PreDestroy Annotation");
    }

}
