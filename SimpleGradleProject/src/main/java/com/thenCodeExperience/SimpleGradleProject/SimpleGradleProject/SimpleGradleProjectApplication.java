package com.thenCodeExperience.SimpleGradleProject.SimpleGradleProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleGradleProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleGradleProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
