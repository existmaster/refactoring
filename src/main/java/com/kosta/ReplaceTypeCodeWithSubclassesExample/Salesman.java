package com.kosta.ReplaceTypeCodeWithSubclassesExample;

public class Salesman extends Employee_After {
    public Salesman(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    int getJobType() {
        return Employee_After.SALESMAN;
    }

    @Override
    double setSalary() {
        this.salary = salary * 1.1;
        return salary;
    }
}
