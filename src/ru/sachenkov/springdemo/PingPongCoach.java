package ru.sachenkov.springdemo;

public class PingPongCoach implements Coach {
    private FortuneService fortuneService;

    public PingPongCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
