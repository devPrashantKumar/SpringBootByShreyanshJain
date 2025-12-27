package com.thecodeexperience.AOPLearning;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass  {

    // Pointcut targeting run(...) of CommandLineRunner
    @Pointcut("execution(* com.thecodeexperience.AOPLearning.MyStartupRunner.sayHello(..))")
    public void startupRunMethod() {}


    @Before("startupRunMethod()")
    public void beforeRun() {
        System.out.println("BEFORE: CommandLineRunner is about to execute");
    }

    @After("startupRunMethod()")
    public void afterRun() {
        System.out.println("AFTER: CommandLineRunner execution completed");
    }


    @AfterReturning(
            pointcut = "startupRunMethod()",
            returning = "result"
    )
    public void afterReturningRun(Object result) {
        System.out.println("AFTER RETURNING: result = " + result);
    }

    @Around("startupRunMethod()")
    public Object aroundRun(ProceedingJoinPoint pjp) {
        System.out.println("AROUND (Before): Application startup logic");

        try {
            Object result = pjp.proceed();
            System.out.println("AROUND (After): Application startup logic finished");
            return result;
        } catch (Throwable ex) {
            System.out.println("AROUND (Exception handled): " + ex.getMessage());
            return null; // prevent app crash
        }
    }

    @AfterThrowing(
            pointcut = "startupRunMethod()",
            throwing = "ex"
    )
    public void afterThrowingRun(Exception ex) {
        System.out.println("AFTER THROWING: Exception occurred -> " + ex.getMessage());
    }

}
