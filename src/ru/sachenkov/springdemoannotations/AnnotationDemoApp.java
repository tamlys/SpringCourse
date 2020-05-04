package ru.sachenkov.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(theBaseballCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
