package main.java._9.중첩클래스인터페이스.Exam02;

public class AnonymousExam {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        //익명객체필드사용
        anony.field.turnOn();

        //익명객체 로컬변수사용
        anony.method1();

        //익명객체매개값사용
        anony.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("스마트 TV를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("스마트 TV를 끕니다.");
                    }
                }
        );
    }
}
