package main.java._5.참조타입;

public class Exam07 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1, 5, 3, 8, 2};
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("max: " + max);


     }
}
