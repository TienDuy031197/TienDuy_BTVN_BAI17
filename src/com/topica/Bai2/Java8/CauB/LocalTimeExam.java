package com.topica.Bai2.Java8.CauB;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExam {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);

        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day = " + specificTime);

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time = " + specificSecondTime);

    }
}
