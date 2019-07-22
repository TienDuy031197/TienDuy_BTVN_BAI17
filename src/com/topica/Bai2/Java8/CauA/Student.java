package com.topica.Bai2.Java8.CauA;

public class Student {
    private String name;
    private int age;
    private int point;

    public Student(String name, int age, int point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + ", Age: " + this.age
                + ", Point: " + this.point;
    }
}
