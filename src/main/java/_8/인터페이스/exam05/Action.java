package main.java._8.인터페이스.exam05;

public  interface Action {
    default void work() {
        System.out.println("복사를 합니다.");

    }
}
