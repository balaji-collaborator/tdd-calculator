package com.balaji.springboot.domain;

/**
 * Created by balaji on 8/2/18.
 */
public class Employee {

    private final int employeeId;
    private final String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
