package main.java._10.예외처리;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {}

    public WrongPasswordException(String message) {
        super(message);
    }

}
