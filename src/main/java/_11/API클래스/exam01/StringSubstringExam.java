package main.java._11.API클래스.exam01;

public class StringSubstringExam {
    public static void main(String[] args) {
        String ssn = "888038434-384829384";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(2, 9);
        System.out.println(secondNum);
    }
}
