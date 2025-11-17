package com.thecodeexperience.ConfigurationPropertiesLearning;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Component
@Getter
@Setter
@ToString
@Validated
@ConfigurationProperties("user")
public class UserConfiguration {
    @NotBlank(message = "name must not be empty")
    private String username;
    @Min(1)
    private int age;
    private boolean active;
    private Address address;
    private List<String> roles;
    private List<Course> courses;
    private Map<String,String> preferences;
    private Map<String,Address> locations;

    @Setter
    @Getter
    @ToString
    static class Address {
        String city;
        String country;
    }

    @Setter
    @Getter
    @ToString
    static class Course {
        String name;
        boolean enrolled;
    }
}
