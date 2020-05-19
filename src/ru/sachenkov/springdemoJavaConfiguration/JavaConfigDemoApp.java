package ru.sachenkov.springdemoJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        Coach alphaCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(alphaCoach.getDailyFortune());
        System.out.println(alphaCoach.getDailyWorkout());
        context.close();
    }
}

/**
 Practice Activity #7 - Inversion of Control and Dependency Injection with Java Code

 Note: In this practice activity, do not use component scanning.

 Create a new Coach implementation.
 Create a new fortune service implementation (return a single hard-coded fortune)

 Create a Java configuration class to perform IoC and DI with those classes.

 Develop a main application to retrieve your coach implementation.
 Test your application and verify your coach implementation is wired up as desired.
 **/