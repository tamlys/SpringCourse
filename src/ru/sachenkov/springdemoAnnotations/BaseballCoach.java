package ru.sachenkov.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 50 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

/**
Practice Activity - Inversion of Control with Java Annotations

- Define a new Coach implementation using Annotations
- Reference the new coach implementation in your main application.
- Test your application to verify you are getting information from your new coach implementation.
 */