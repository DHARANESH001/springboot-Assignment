package com.example.demo.controllers;
import com.example.demo.models.Employee;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    private MyService myService;

    @PostMapping("/post")
    public String postMethod() {
        return myService.postMethod();
    }

    @GetMapping("/")
    public String hello() {
        System.out.println("Hello");
        return myService.getWelcomeMessage();
    }

    @PutMapping("/put")
    public String putMethod() {
        return myService.putMethod();
    }

    @DeleteMapping("/delete")
    public String deleteMethod() {
        return myService.deleteMethod();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return myService.getAllEmployees();
    }

    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee emp) {
        myService.addEmployee(emp);
        return "Employee added ";
    }
}
