package com.docker_studentApp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentRepo repo;

    List<Student> students= new ArrayList<>(List.of(
            new Student(1,"ranjan","java"),
            new Student(2,"osho","sanatan")
    ));

    @GetMapping("/getStudents")
    public List<Student> getAllStudent(){
        return repo.findAll();
    }

    @PostMapping("addStudent")
    public void addStudents(@RequestBody Student s){
        repo.save(s);
    }
}
