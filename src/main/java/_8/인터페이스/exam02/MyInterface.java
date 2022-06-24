package main.java._8.인터페이스.exam02;

public interface MyInterface {
    public void method1() ;

    public default void method2() {
        System.out.println("MyInterface-mothod2 실행");
    }
}
