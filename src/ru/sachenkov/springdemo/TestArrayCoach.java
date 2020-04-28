package ru.sachenkov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArrayCoach {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myPingPongCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
