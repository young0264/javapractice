package main.java._11.API클래스.exam04;

public class BytesToStringExam {
    public static void main(String[] args) {
        byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
        String str = new String(bytes);
        System.out.println(str);
    }
}
