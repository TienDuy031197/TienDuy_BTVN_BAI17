package com.topica.Bai2.Java8.CauA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("A",22,9));
        studentList.add(new Student("B",21,10));
        studentList.add(new Student("C",20,7));
        studentList.add(new Student("D",22,9));
        studentList.add(new Student("A",22,5));
        studentList.add(new Student("C",21,9));

        Handler handler = new Handler();
        System.out.println("The number of students has a score greater than 7:");
        System.out.println(handler.getCountPoint(studentList,7));
        System.out.println("total score of students");
        System.out.println(handler.getSumPoint(studentList));
        System.out.println("Student group by age");
        System.out.println(handler.groupStudentByAge(studentList));
        System.out.println("The group of students is similar");
        System.out.println(handler.numberOfSameName(studentList));
        System.out.println("The total group of students with the same name");
        System.out.println(handler.sumPointOfSameName(studentList));
    }
}
