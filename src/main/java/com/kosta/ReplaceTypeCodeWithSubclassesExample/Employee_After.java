package com.kosta.ReplaceTypeCodeWithSubclassesExample;

public abstract class Employee_After {

    protected String name;
    protected double salary;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    static final String[] jobTypes = {"engineer", "salesman", "manager"};

    abstract int getJobType();
    abstract double setSalary();

    static Employee_After create(String name, double salary, int jobType) {
        switch (jobType) {
            case ENGINEER: return new Engineer(name, salary);
            case SALESMAN: return new Salesman(name, salary);
            case MANAGER: return new Manager(name, salary);
            default: throw new IllegalArgumentException("Incorrect job type");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee_After june = Employee_After.create("June", 400000, ENGINEER);
        System.out.println(june.name + "'s job type is " + jobTypes[june.getJobType()]);
        System.out.println(june.name + "'s new salary is " + june.setSalary());
    }


}
