package ru.sachenkov.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {}

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it " + fortuneService.getFortune();
    }

    private void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    private void doMyCleanupStuffYoYo() {
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }
}
