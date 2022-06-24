package main.java._7.상속.exam03;

public class SnowTireExam {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = new Tire();
        //Tire tire = snowTire;

        tire.run();
        snowTire.run();
    }
}
