package me.whiteship.java8to11.JH.section2;

import java.util.Locale;

public interface DefaultMethodInterface {

    void printName();

    // default Methods 를 인터페이스에 구현하면 해당 인터페이스를 상속하는 모든 클래스에 적용됨.
    // default Methods 는 구현체가 모르게 추가된 기능으로 리스크가 크기 때문에 반드시 문서화를 해야한다. (@implSpec)

    /**
     * @implSpec
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase(Locale.ROOT));
    }

    // Interface 의 static 메소드
    static void printAnything() {
        System.out.println("Foo");
    }

    String getName();

}
