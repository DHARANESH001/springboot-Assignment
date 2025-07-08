package com.example.demo.service;

import com.example.demo.models.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public String postMethod() {
        return "Post method called successfully";
    }

    public String getWelcomeMessage() {
        return "Get method called successfully";
    }

    public String putMethod() {
        return "Put method called";
    }

    public String deleteMethod() {
        return "Delete method called";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}

