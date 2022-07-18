package main.java._11.API클래스.exam05;

public class StringBuilderExam {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 100; i++) {
            str += i;
        }
        System.out.println(str);
        System.out.println();
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            ans.append(i);
        }
        System.out.println(ans);
    }
}
