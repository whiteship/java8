package me.whiteship.java8to11.JH.section1;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    public static void main(String[] args) {
        /* static method 참조 */
        UnaryOperator<String> hi = Greeting::hi;


        /* 생성자 */
        // Greeting()
        Supplier<Greeting> newGreeting1 = Greeting::new;

        // Greeting(String name)
        Function<String, Greeting> newGreeting2 = Greeting::new;


        /* 특정 객체의 instance method 참조 */
        // newGreeting 을 통해 greeting 객체 생성
        Greeting greeting1 = newGreeting1.get();
        Greeting greeting2 = newGreeting2.apply("tom");

        // 특정 객체의 메소드 참조
        UnaryOperator<String> hello = greeting1::hello;
        hello.apply("hello");
    }
}
