package main.java._8.인터페이스.exam02;

public interface ChildInterface2 extends ParentInterface {
    @Override
    default void method2() {
    }

    public void method3();
}
