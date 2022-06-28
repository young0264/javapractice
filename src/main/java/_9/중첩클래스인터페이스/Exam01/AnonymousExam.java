package main.java._9.중첩클래스인터페이스.Exam01;

public class AnonymousExam {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        //익명객체필드사용
        anony.field.wake();

        //익명객체로컬변수사용
        anony.method1();

        //익명객체매개값사용
        anony.method2(
                new Person() {
                    void study() {
                        System.out.println("공부합니다.");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 일어납니다");
                        study();
                    }
                }
        );
    }
}
