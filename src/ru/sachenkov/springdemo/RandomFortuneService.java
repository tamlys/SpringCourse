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
