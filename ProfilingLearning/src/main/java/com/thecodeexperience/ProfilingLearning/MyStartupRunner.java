package com.thecodeexperience.ProfilingLearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Arrays;

@Component
public class MyStartupRunner implements CommandLineRunner {

    @Value("${spring.application.name}")
    String applicationName;

//    @Value("${spring.profiles.active}")
//    String activeProfiles;

    @Value("${spring.profiles.active}")
    String[] activeProfiles;

    @Value("${custom.property}")
    String customProperty;


    @Override
    public void run(String... args) {
        System.out.println("ProfilingLearning Application started");
        System.out.println("applicationName : "+applicationName);
        //System.out.println("activeProfiles : "+ activeProfiles);
        System.out.println("activeProfiles : "+ Arrays.toString(activeProfiles));
        System.out.println("customProperty : "+customProperty);
    }
}
