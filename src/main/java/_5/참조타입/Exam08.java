package main.java._5.참조타입;

public class Exam08 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        //
        for (int[] brr : arr) {
            for (int i : brr) {
                sum += i;
                cnt += 1;
            }
        }
        avg = sum / cnt;
        System.out.println("sum : " + sum);
        System.out.println("avg : "+ avg);
    }
}
