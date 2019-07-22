package com.topica.Bai2.Java8.CauB;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExam {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Current Date = " + today);

        LocalDate firstDay_2019 = LocalDate.of(2019, Month.JULY, 21);
        System.out.println("Specific Date = " + firstDay_2019);

        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date = " + dateFromBase);

        LocalDate hundredDay2019 = LocalDate.ofYearDay(2019, 100);
        System.out.println("100th day of 2014 = " + hundredDay2019);
    }
}
