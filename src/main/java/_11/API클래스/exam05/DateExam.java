package main.java._11.API클래스.exam05;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat date1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(date1.format(now));


    }
}
