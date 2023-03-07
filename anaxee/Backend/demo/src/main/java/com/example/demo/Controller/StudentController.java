package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // get all Students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // create students rest api
    @PostMapping("/students")
    public Student createStudents(@RequestBody Student Students) {
        return studentRepository.save(Students);
    }
}
