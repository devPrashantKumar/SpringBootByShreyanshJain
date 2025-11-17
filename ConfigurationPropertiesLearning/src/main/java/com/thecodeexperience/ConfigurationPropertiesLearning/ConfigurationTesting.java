package com.thecodeexperience.ConfigurationPropertiesLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationTesting implements CommandLineRunner {
    @Autowired
    UserConfiguration userConfiguration;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("configurations : "+ userConfiguration);
        System.out.println("Address : "+ userConfiguration.getAddress());
        System.out.println("Roles : "+ userConfiguration.getRoles());
        System.out.println("Courses : "+ userConfiguration.getCourses());
        System.out.println("Preferences : "+ userConfiguration.getPreferences());
    }
}
