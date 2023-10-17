package com.kosta.EncapsulateCollectionExample;

import java.util.Iterator;

public class Client_After {

    public static void main(String[] args) {
        Person_After june = new Person_After();
        june.setName("June");
        june.addCourse(new Course_Before("Java Programming", false));
        june.addCourse(new Course_Before("Refactoring", true));
        june.addCourse(new Course_Before("Clean Code", true));
        june.addCourse(new Course_Before("Junit", false));
        Iterator iter = june.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course_Before course = (Course_Before) iter.next();
            if (course.isAdvanced()) count++;
        }
        System.out.println("Number of advanced courses taken by " + june.getName() + " is " + count);
    }

}
