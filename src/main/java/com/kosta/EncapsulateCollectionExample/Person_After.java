package com.kosta.EncapsulateCollectionExample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person_After {

    private String name;
    private Set<Course_Before> courses = new HashSet<Course_Before>();
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }
    public void initializeCourses(Set arg) throws Exception {
        if (courses.isEmpty()) {
            courses.addAll(arg);
        }
        else throw new Exception("Cannot initialize the courses set because it is not empty.");
    }


    public void addCourse(Course_Before course) {
        courses.add(course);
    }
    public void removeCourse(Course_Before course) {
        courses.remove(course);
    }
}
