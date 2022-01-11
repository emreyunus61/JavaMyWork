package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    @Qualifier("ornekOgrencıler2")
    private List<Student> students;

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudentToArray(@RequestBody Student student) {
        students.add(student);
    }

    @GetMapping("{id}")
    public Student getAllStudents(@PathVariable Integer id) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (Objects.equals(id, student.getId()))
                return student;
        }
        return null;
    }


}
