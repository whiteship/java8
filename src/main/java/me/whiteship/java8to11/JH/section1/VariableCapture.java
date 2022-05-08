package me.whiteship.java8to11.JH.section1;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class VariableCapture {

    public static void main(String[] args) {
        VariableCapture variableCapture = new VariableCapture();
        variableCapture.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11 출력
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber); // 인자값 출력
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            // int baseNumber = 10; 에러남. (람다는 같은 Scope)
            System.out.println(i + baseNumber);
        };
    }
}