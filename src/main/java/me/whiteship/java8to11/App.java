package me.whiteship.java8to11;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("keesun");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }

}
