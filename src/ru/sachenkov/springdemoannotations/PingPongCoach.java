package ru.sachenkov.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PingPongCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    public PingPongCoach() {
        System.out.println("PingPongCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your pingpong drop shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
