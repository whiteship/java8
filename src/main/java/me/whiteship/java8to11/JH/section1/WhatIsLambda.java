package me.whiteship.java8to11.JH.section1;
import java.util.function.Function;

public class WhatIsLambda {

    public static void main(String[] args) {

        /* Java 8 이전 */
        // 익명 내부 클래스 anonymous inner class
        FunctionalInterface functionalInterfaceOrigin = new FunctionalInterface() {
            @Override
            public int doIt(int number) {
                return number + 10;
            }
        };


        /* Java 8 이후 */
        // 람다 형태의 표현법
        // 즉 람다는 함수형 인터페이스를 인라인으로 구현할 수 있다.
        FunctionalInterface functionalInterfaceLambda = (number) ->  {
            return number + 10;
        };
        System.out.println(functionalInterfaceLambda.doIt(10));

        // Function 인터페이스: 대표적인 함수형 인터페이스 (java.util.function.Function)
        // apply 라는 추상 메소드 하나만 구현하면 됨.
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));
    }
}
