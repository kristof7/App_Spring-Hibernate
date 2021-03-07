package com.kampa.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    private String employeeName;

    private int age;

    public Employee(String employeeName, int age) {
        this.employeeName = employeeName;
        this.age = age;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, employeeAge=%d, employeeName='%s']",
                employeeId, age, employeeName);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int employeeAge) {
        this.age = employeeAge;
    }
}
