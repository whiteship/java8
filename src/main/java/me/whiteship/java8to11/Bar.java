package me.whiteship.java8to11;

public interface Bar {

    default void printNameUpperCase() {
        System.out.println("BAR");
    }

}
