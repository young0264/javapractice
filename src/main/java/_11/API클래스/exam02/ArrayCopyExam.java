package main.java._11.API클래스.exam02;

import java.util.Arrays;

public class ArrayCopyExam {
    public static void main(String[] args) {
        char[] arr1 = {'J', 'A', 'V', 'A'};

        //방법
        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
    }
}
