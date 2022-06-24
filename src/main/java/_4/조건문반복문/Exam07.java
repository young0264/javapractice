package main.java._4.조건문반복문;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        while (run) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출급 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            switch (value) {
                case 1:
                    System.out.println("선택> 1");
                    System.out.println("예금액> 10000");
                    break;
                case 2:
                    System.out.println("선택> 2");
                    System.out.println("출금액> 2000");
                    break;

                case 3:
                    System.out.println("선택> 3");
                    System.out.println("잔고> 8000");
                    break;
                case 4:
                    System.out.println("선택> 4");
                    System.out.println("프로그램 종료");
                    run = false;


            }

        }
    }
}
