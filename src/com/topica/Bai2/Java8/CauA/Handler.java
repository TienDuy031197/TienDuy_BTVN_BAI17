package com.topica.Bai2.Java8.CauA;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Handler implements CountSumGroupObject {
    @Override
    public Map<Integer, List<Student>> groupStudentByAge(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getAge));
    }

    @Override
    public int getSumPoint(List<Student> students) {
        return students.stream()
                .map(Student::getPoint)
                .collect(Collectors.summingInt(Integer::intValue));
    }

    @Override
    public long getCountPoint(List<Student> students, int minPoint) {
        return students.stream()
                .filter(skill -> skill.getPoint() >= minPoint)
                .count();
    }

    @Override
    public Map<String, Long> numberOfSameName(List<Student> students) {
        return students.stream().collect(
                Collectors.groupingBy(Student::getName, Collectors.counting()));
    }

    @Override
    public Map<String, Integer> sumPointOfSameName(List<Student> students) {
        return students.stream().collect(
                Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getPoint)));
    }
}
