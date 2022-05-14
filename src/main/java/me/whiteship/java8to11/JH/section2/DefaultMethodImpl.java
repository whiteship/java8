package me.whiteship.java8to11.JH.section2;

public class DefaultMethodImpl implements DefaultMethodInterface {

    String name;

    public DefaultMethodImpl(String name) {
        this.name = name;
    }

    // Default Methods 로 정의돈 printNameUpperCase 도 오버라이딩하여 재정의가 가능함.
    // 하지만 Object 에 구현되어 있는 메소드는 안 됨. (ex: Object.toString)
    @Override
    public void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
