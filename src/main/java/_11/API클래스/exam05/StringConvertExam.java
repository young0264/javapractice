package main.java._11.API클래스.exam05;

import static java.lang.Integer.parseInt;

public class StringConvertExam {
    public static void main(String[] args) {
        String strData1 = "300";
        int intData1 = parseInt(strData1);

        int intData2 = 200;

        String strData2 = Integer.toString(intData2);
        String strData3 = String.valueOf(intData2);

        System.out.println(intData1);
        System.out.println(strData2);
        System.out.println(strData3);
    }
}
