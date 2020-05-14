package ru.sachenkov.springdemoannotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileFortuneService implements FortuneService {
    private String fileName = "C:/Users/Vallov/IdeaProjects/SpringCourseMain/src/ru/sachenkov/springdemoannotations/fortune-data.txt";
    private List<String> theFortunes = new ArrayList<>();
    private Random random = new Random();

    public FileFortuneService() {
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
