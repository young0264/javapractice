package main.java._8.인터페이스.exam02;

public class DefaultMethodExam {
    public static void main(String[] args) {
        MyInterface mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();

        MyInterface mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
    }
}
