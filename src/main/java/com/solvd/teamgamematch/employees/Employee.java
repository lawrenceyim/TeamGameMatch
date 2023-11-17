package com.solvd.teamgamematch.employees;

import com.solvd.teamgamematch.Main;
import com.solvd.teamgamematch.person.Person;

import java.math.BigDecimal;

/**
 * Contain information about employees in the company
 *
 * @author Lawrence Yim
 * @version 1.0 31 Oct 2023
 */

public class Employee extends Person {
    private BigDecimal salary;
    private String employeeId;

    public Employee(String name, BigDecimal salary, String employeeId) {
        super(name);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee Name: " + getName() +
                "\nEmployee ID: " + employeeId +
                "\nSalary: $" + salary;
    }

    @Override
    public void personDetail() {
        Main.getOutput().displayOutput(getName() + " is an employee");
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
