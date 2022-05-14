package me.whiteship.java8to11.JH.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class UsefulDefaultMethods {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        System.out.println("=====forEach======");
        // # forEach(Consumer<T>): 아래의 로직을 구현 가능함
        for (String n : names)
            System.out.println(n);
        // 1. 가장 기본적인 구현 방법
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // 2. 람다 적용
        names.forEach(s -> System.out.println(s));
        // 3. 메소드 레퍼런스 적용 (스태틱 메소드 참조 방식)
        names.forEach(System.out::println);

        System.out.println("=====spliterator======");
        // # spliterator(<Consumer<T>): 쪼갤 수 있는 기능을 가진 Iterator
        Spliterator<String> spliterator = names.spliterator();
        while (spliterator.tryAdvance(System.out::println));

        // # removeIf(Predicate<T>)
        names.removeIf(s -> s.startsWith("k"));

        // # Comparator
        names.sort(String::compareToIgnoreCase);
    }
}
