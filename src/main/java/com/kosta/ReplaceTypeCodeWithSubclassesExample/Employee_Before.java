package com.kosta.ReplaceTypeCodeWithSubclassesExample;

public class Employee_Before {

    private String name;
    private double salary;
    private int jobType;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    static final String[] jobTypes = {"engineer", "salesman", "manager"};

    Employee_Before(int jobType) {
        this.jobType = jobType;
    }
    public double setSalary(int jobType) throws Exception {
        switch(jobType) {
            case ENGINEER:
                return salary *= 1.2;
            case SALESMAN:
                return salary *= 1.1;
            case MANAGER:
                return salary *= 1.05;
            default:
                throw new IllegalArgumentException("Incorrect job type");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee_Before june = new Employee_Before(0);
        june.name = "June";
        june.salary = 400000;
        System.out.println(june.name + "'s job type is " + jobTypes[june.jobType]);
        System.out.println(june.name + "'s new salary is " + june.setSalary(june.jobType));
    }


}
