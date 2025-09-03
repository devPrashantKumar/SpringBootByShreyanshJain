package com.thecodeexperience.AOPLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("AOPLearning Application started");
    }
}
