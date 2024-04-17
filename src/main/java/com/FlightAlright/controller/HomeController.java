package com.FlightAlright.controller;

import com.FlightAlright.model.Employee;
import com.FlightAlright.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public @ResponseBody Iterable<Employee> home()
    {
        return employeeRepository.findAll();
    }
}
