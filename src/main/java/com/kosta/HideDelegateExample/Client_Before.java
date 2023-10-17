package com.kosta.HideDelegateExample;

public class Client_Before {
    public static void main(String[] args) {
        Person_Before person = new Person_Before();
        person.setName("June Park");
        Department_Before department = new Department_Before("IT");
        System.out.println(person.getName() + " is in " + department.getDepartmentName() + " department.");
    }
}
