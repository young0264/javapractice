package main.java._9.중첩클래스인터페이스.Exam05;

public class NestedClassExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}
