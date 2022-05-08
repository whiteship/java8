package me.whiteship.java8to11.JH.section1;

/*
인터페이스에 추상 메소드가 딱 하나만 있어야 함수형 인터페이스다.
아래 @FunctionalInterface 애노테이션은 함수형 인터페이스가 아니면 컴파일 에러를 띄움.
 */

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    // 추상 메소드. 앞에 abstract 생략됨.
    int doIt(int number);

    // void doThat(); -> 추상 메소드가 두 개라서 에러 발생.

    // static 메소드
    static void printName() {
        System.out.println("Keesun");
    }

    // default: 인터페이스지만 함수 선언 가능
    default void printAge() {
        System.out.println("40");
    }

}
