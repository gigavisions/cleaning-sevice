package com.giga.cleaning.service.Controller;

import com.giga.cleaning.service.EmployeeRepository;
import com.giga.cleaning.service.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeRepository repo;

    @GetMapping("Employees")
    public List<Employee> getEmployees() {
        System.out.println("hello");
        return repo.findAll();
    }

    @GetMapping("lol")
    public String lol(){
        return "Hello World";
    }
}
