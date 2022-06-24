package main.java._8.인터페이스.exam04;

public interface DataAccessObject {

    public default void select() {}
    public default void insert() {}
    public default void update() {}
    public default void delete() {}

}
