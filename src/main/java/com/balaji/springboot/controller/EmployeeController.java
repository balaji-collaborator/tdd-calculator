package com.balaji.springboot.controller;

import com.balaji.springboot.domain.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by balaji on 8/2/18.
 */
@RestController
public class EmployeeController {

    @RequestMapping("/")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @RequestMapping(path = "/employees/id/{id}")
    public Employee getEmployee(@PathVariable("id") int employeeId) {
        return new Employee(employeeId, "Balaji");
    }
}
