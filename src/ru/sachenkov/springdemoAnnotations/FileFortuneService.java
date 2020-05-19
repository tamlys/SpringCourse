package ru.sachenkov.springdemoAnnotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {
    private String fileName = "C:/Users/Vallov/IdeaProjects/SpringCourseMain/src/ru/sachenkov/springdemoannotations/fortune-data";
    private List<String> theFortunes = new ArrayList<>();
    private Random random = new Random();

    public FileFortuneService() {
        System.out.println("FileFortuneService: inside default constructor");
    }

    @PostConstruct
    public void loadTheFortuneFile() {
        System.out.println("FileFortuneService: inside method loadTheFortuneFile");
        File file = new File(fileName);
        System.out.println("Reading fortunes from file: " + fileName);
        System.out.println("File exists : " + file.exists());

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = br.readLine()) != null) {
                theFortunes.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(theFortunes.size());
        String fortune = theFortunes.get(index);
        return fortune;
    }
}

/**
 Practice Activity #6 - Bean Scopes with Annotations

 1. Modify your file based fortune service to make use of the @PostConstruct annotation

 2. In the @PostConstruct code, read the fortunes from a text file (.txt).

 3. Test your application and verify your @PostConstruct code is being executed. Hint, add some println statements.
 **/