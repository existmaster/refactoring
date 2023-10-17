package com.kosta.EncapsulateCollectionExample;

import java.util.Iterator;

public class Client_Before {

    public static void main(String[] args) {
        Person_Before june = new Person_Before();
        june.setName("June");
        june.getCourses().add(new Course_Before("Java Programming", false));
        june.getCourses().add(new Course_Before("Refactoring", true));
        june.getCourses().add(new Course_Before("Clean Code", true));
        june.getCourses().add(new Course_Before("Junit", false));
        Iterator iter = june.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course_Before course = (Course_Before) iter.next();
            if (course.isAdvanced()) count++;
        }
        System.out.println("Number of advanced courses taken by " + june.getName() + " is " + count);
    }

}
