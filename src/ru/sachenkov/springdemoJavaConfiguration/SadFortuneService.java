package ru.sachenkov.springdemoJavaConfiguration;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
