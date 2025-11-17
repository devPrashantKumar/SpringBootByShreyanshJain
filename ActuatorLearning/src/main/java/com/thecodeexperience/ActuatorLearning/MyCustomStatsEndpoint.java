package com.thecodeexperience.ActuatorLearning;

import com.thecodeexperience.ActuatorLearning.CO.Student;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customendpoint")
public class MyCustomStatsEndpoint {

    @ReadOperation
    public String syaHello(){
        return "Hello Spring Boot!!";
    }

    @ReadOperation
    public String syaHello(@Selector String name, @Selector String greeting){
        return "Hello "+name+" , "+greeting+"!!";
    }

    @WriteOperation()
    public Student syaHello2(@Selector int rollNumber, @Selector String studentName){
        return Student.builder().rollNumber(rollNumber).name(studentName).build();
    }

    @DeleteOperation()
    public String syaHello3(@Selector int rollNumber){
        return "Deleted : "+rollNumber;
    }
}