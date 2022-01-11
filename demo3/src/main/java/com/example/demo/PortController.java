package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PortController {

    @Value("${adinne}")
    String name;

    @GetMapping("whatisyourname")
    public Map<String, String> whatisYourPort() {
        return Map.of("adim", name);
    }
}