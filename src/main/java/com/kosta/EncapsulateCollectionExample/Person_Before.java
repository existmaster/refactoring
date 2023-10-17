package com.kosta.EncapsulateCollectionExample;

import java.util.HashSet;
import java.util.Set;

public class Person_Before {

    private String name;
    private Set<Course_Before> courses = new HashSet<Course_Before>();
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Set getCourses() { return courses; }
    public void setCourses(Set arg) { courses = arg; }


}
