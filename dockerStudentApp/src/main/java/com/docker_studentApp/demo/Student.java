package com.docker_studentApp.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "collegeStudent")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String name;
    private String tech;
}
