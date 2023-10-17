package com.kosta.HideDelegateExample;

public class Person_After {
    private String name;
    private Department_After department;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Department_After getDepartment() { return department; }
    public void setDepartment(String departmentName) {
        this.department = new Department_After(departmentName);
    }

}
