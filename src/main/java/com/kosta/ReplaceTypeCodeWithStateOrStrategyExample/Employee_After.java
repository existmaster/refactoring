package com.kosta.ReplaceTypeCodeWithStateOrStrategyExample;

public class Employee_After {

    private String name;
    private double salary;

    public JobType_After getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = JobType_After.create(jobType);
    }

    private JobType_After jobType;

    Employee_After(String name, double salary, int jobType) {
        this.name = name;
        this.salary = salary;
        this.jobType = JobType_After.create(jobType);
    }
    public double setSalary() {
        salary = jobType.calulateSalary(salary);
        return salary;
    }

    public static void main(String[] args) throws Exception {
        Employee_After june = new Employee_After(
                "June", 400000, JobType_After.ENGINEER
        );
        june.setJobType(JobType_After.SALESMAN);
        System.out.println(june.name + "'s job type is " + JobType_After.jobTypes[june.getJobType().getJobType()]);
        System.out.println(june.name + "'s new salary is " + june.setSalary());
    }


}
