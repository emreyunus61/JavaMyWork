package com.deka.bookservice.controller;


import com.deka.bookservice.model.Writer;
import com.deka.bookservice.repository.WriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WriteController {

    @Autowired
    private WriteRepository writeRepository;

    @GetMapping("/writes")
    public List<Writer> getAllWriters() {
        return writeRepository.findAll();
    }

    //Create Writer
    //postman url http://localhost:8080/api/v1/writes
    @PostMapping("/writes")
    public Writer createWriter(@RequestBody Writer writer) {
        return writeRepository.save(writer);
    }









}
