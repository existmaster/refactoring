package com.kosta.ReplaceTypeCodeWithSubclassesExample;

public class Manager extends Employee_After {
    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    int getJobType() {
        return Employee_After.MANAGER;
    }

    @Override
    double setSalary() {
        this.salary = salary * 1.05;
        return salary;
    }

}
