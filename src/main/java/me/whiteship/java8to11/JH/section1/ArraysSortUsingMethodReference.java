package me.whiteship.java8to11.JH.section1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortUsingMethodReference {

    public static void main(String[] args) {
        String[] names = {"A", "C", "B"};

        /* 일반적인 정렬 코드
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {...}
        });
        */

        // 임의의 객체의 instance method 참조를 통해 코드 간결화
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names)); //[A, B, C]
    }
}
