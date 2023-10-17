package com.kosta.HideDelegateExample;

public class Client_After {
    public static void main(String[] args) {
        Person_After person = new Person_After();
        person.setName("June Park");
        person.setDepartment("IT");
        System.out.println(person.getName() + " is in " +
                person.getDepartment().getDepartmentName() + " department.");
    }
}
