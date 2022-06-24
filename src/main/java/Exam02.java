package main.java;

import java.util.Calendar;

public class Exam02 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }

}