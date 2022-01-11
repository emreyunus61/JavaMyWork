package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConf {

    @Bean
    public List<Student> ornekOgrencıler() {

        Student student = new Student(1, "samet", "eray");
        Student student1 = new Student(2, "Yunus", "malli");
        Student student2 = new Student(3, "Fethat", "komurcu");
        return Arrays.asList(student, student1, student2);
    }

    @Bean
    public List<Student> ornekOgrencıler2() {

        Student student = new Student(1, "das", "eray");
        Student student1 = new Student(2, "das", "malli");
        Student student2 = new Student(3, "dasda", "komurcu");
        return Arrays.asList(student, student1, student2);
    }

   /* @Bean
    public Calculator calculator() {
        Calculator calculator = new Calculator();
        return calculator;
    }
    */
}
