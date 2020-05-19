package ru.sachenkov.springdemoJavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
