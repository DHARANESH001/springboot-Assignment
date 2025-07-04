package com.example.demo.service;
import com.example.demo.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MyService {
    List<Employee> empList = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prasanth", "Trainer"),
                    new Employee(2, "Yuvaraj", "Faculty")
            )
    );
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
    public List<Employee> getAllEmployees() {
        return empList;
    }
    public void addEmployee(Employee emp) {
        empList.add(emp);
    }
}
