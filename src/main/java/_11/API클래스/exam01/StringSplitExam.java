package main.java._11.API클래스.exam01;

public class StringSplitExam {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";

        String[] names = text.split("&|,|-");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
