package ru.sachenkov.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private Random random = new Random();
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        String temp = data[index];
        return temp;
    }
}

/**
 Practice Activity #2 - Dependency Injection with XML Configuration

 1. Define a new implementation for the FortuneService.

    a. When the getFortune() method is called it should return a random fortune from the array.

    b. Your fortune service should define three fortunes in an array.

 2. Inject your new dependency into your Coach implementation.

 3. Test your application to verify you are retrieving random fortunes.
 */