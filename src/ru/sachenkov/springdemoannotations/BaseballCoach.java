package ru.sachenkov.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 50 minutes on batting practice";
    }
}

/**
Practice Activity - Inversion of Control with Java Annotations

- Define a new Coach implementation using Annotations
- Reference the new coach implementation in your main application.
- Test your application to verify you are getting information from your new coach implementation.
 */