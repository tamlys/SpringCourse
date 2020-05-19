package ru.sachenkov.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
        Coach theCoach = context.getBean("pingPongCoach", Coach.class);
        Coach alphaCoach = context.getBean("pingPongCoach", Coach.class);
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object :" + result);
        System.out.println("\nMemory location for theCoach :" + theCoach);
        System.out.println("\nMemory location for theAlphaCoach :" + alphaCoach + "\n");
        context.close();
    }
}
