package com.topica.Bai2.Java8.CauA;

import java.util.List;
import java.util.Map;

public interface CountSumGroupObject {
    Map<Integer, List<Student>> groupStudentByAge(List<Student> students);

    int getSumPoint(List<Student> students);

    long getCountPoint(List<Student> students, int minPoint);

    Map<String, Long> numberOfSameName(List<Student> students);

    Map<String, Integer> sumPointOfSameName(List<Student> students);
}
