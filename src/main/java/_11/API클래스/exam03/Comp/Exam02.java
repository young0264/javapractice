package main.java._11.API클래스.exam03.Comp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam02 {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat(" MM월 dd일");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

    }
}
