package ru.sachenkov.springdemoannotations;

import org.springframework.stereotype.Component;


public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
