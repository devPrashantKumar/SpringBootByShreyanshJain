package com.thecodeexperience.TransactionLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner {

    @Autowired
    private RequiredPropagationPractice requiredPropagationPractice;
    @Autowired
    private RequiresNewPropagationPractice requiresNewPropagationPractice;
    @Autowired
    private SupportsPropagationPractice supportsPropagationPractice;
    @Autowired
    private NotSupportedPropagationPractice notSupportedPropagationPractice;
    @Autowired
    private MandatoryPropagationPractice mandatoryPropagationPractice;
    @Autowired
    private NeverPropagationPractice neverPropagationPractice;

    @Override
    public void run(String... args) {
        System.out.println("---------------------------------------------");
        requiredPropagationPractice.requiredPropagationMethod1();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        requiresNewPropagationPractice.requiresNewPropagationMethod1();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        supportsPropagationPractice.supportsPropagationMethod1();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        notSupportedPropagationPractice.notSupportedPropagationMethod1();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        mandatoryPropagationPractice.mandatoryPropagationMethod1();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        neverPropagationPractice.neverPropagationMethod1();
        System.out.println("---------------------------------------------");
    }
}
