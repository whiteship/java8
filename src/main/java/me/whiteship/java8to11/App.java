package me.whiteship.java8to11;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        name.forEach(System.out::println);
    }

}
