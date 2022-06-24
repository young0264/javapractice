package main.java._4.조건문반복문;

public class Exam05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.println("("+i+", "+j+")");
                }
            }
        }
    }
}
