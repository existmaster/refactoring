package com.kosta.ReplaceTypeCodeWithSubclassesExample;

public class Engineer extends Employee_After {
    public Engineer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    int getJobType() {
        return Employee_After.ENGINEER;
    }

    @Override
    double setSalary() {
        this.salary = salary * 1.2;
        return salary;
    }

}
