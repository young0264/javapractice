package main.java._11.API클래스.exam01;

public class SmartPhoneExam {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println("strObj : " + strObj);
        System.out.println("myphone : " + myPhone);
    }
}
