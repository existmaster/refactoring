package com.kosta.ReplaceTypeCodeWithStateOrStrategyExample;

public abstract class JobType_After {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    static final String[] jobTypes = {"engineer", "salesman", "manager"};

    abstract int getJobType();
    abstract double calulateSalary(double salary);

    static JobType_After create(int jobType) {
        switch (jobType) {
            case ENGINEER: return new Engineer();
            case SALESMAN: return new Salesman();
            case MANAGER: return new Manager();
            default: throw new IllegalArgumentException("Incorrect job type");
        }
    }


    static class Engineer extends JobType_After {
        @Override
        int getJobType() {
            return ENGINEER;
        }

        @Override
        double calulateSalary(double salary) {
            return salary * 1.2;
        }
    }

    static class Salesman extends JobType_After {
        @Override
        int getJobType() {
            return SALESMAN;
        }

        @Override
        double calulateSalary(double salary) {
            return salary * 1.1;
        }
    }

    static class Manager extends JobType_After {
        @Override
        int getJobType() {
            return MANAGER;
        }

        @Override
        double calulateSalary(double salary) {
            return salary * 1.05;
        }
    }
}
