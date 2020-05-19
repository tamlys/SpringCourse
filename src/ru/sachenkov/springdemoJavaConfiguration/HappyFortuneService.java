package ru.sachenkov.springdemoJavaConfiguration;
import org.springframework.stereotype.Component;
import ru.sachenkov.springdemoAnnotations.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
