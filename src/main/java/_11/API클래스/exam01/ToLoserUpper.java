package main.java._11.API클래스.exam01;

public class ToLoserUpper {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println(str1.equals(str2));


        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
