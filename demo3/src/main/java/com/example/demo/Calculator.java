package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Calculator {
    public int sum(Integer a, Integer b) {
        return a + b;
    }
}
