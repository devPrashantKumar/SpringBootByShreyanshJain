package com.thecodeexperience.AOPLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) {
        MyStartupRunner proxy = context.getBean(MyStartupRunner.class);
        proxy.sayHello(); // goes through proxy
    }

    public String sayHello(){
        System.out.println("Called sayHello Method");
        //throw new RuntimeException("exception occured");
        return "HelloWorld";
    }
}
