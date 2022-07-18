package main.java._11.API클래스.exam05;

import java.util.StringTokenizer;

public class SplitExam {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";

        //방법1 (split()메소드 이용)
        String[] res = str.split(",");
        System.out.println(res);
        for (String i : res) {
            System.out.println(i);
        }
        System.out.println();

        //방법2 (StringTokenizer 이용)
        StringTokenizer ans = new StringTokenizer(str, ",");
        while (ans.hasMoreTokens()) {
            String token = ans.nextToken();
            System.out.println(token);
        }
    }
}
