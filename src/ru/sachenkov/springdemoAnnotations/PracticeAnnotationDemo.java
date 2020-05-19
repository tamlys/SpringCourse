package ru.sachenkov.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
        Coach theCoach = context.getBean("pingPongCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}

/**
 *Practice Activity #5 - Dependency Injection with Annotations
 *
 * 1. Define a new implementation for the FortuneService.
 *
 * Your fortune service should read the fortunes from a file.
 *
 * The fortune service should load the fortunes into an array
 *
 * When the getFortune() method is called it would return a random fortune from the array.
 *
 * 2. Inject your new dependency into your Coach implementation
 *
 * 3. Test your application to verify you are getting random fortunes based on your fortunes file.
 */
