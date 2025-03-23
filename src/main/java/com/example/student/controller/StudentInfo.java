package com.example.student.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentInfo {

    @GetMapping("/getinfo")
    public List<String> getInfo(){
      List<String> studentInfo = new ArrayList<>();
        studentInfo.add("Shree");
        studentInfo.add("Shyam");
        studentInfo.add("Raghav");
        studentInfo.add("Madhav");
        studentInfo.add("Shiv");
      return  studentInfo;
    }
}
