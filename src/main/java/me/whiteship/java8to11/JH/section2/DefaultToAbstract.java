package me.whiteship.java8to11.JH.section2;

public interface DefaultToAbstract extends DefaultMethodInterface {
    // 기본 메소드를 재정의하여 추상 메소드로 변경함.
    // DefaultToAbstract 의 구현체는 반드시 아래 추상 메소드를 구현해야 함.
    @Override
    void printNameUpperCase();
}
