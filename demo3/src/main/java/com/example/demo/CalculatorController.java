package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calculator")
public class CalculatorController {


    @Autowired
    private Calculator calculator;

    @GetMapping("{firstNumber}/{secondNumber}")
    public Integer integer(@PathVariable Integer firstNumber, @PathVariable Integer secondNumber) {
        return calculator.sum(firstNumber, secondNumber);
    }


}
