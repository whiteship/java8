package me.whiteship.java8to11.JH.section5;
import me.whiteship.java8to11.JH.section4.Progress;

import java.util.Optional;

public class WhatIsOptional {

    public static void main(String[] args) {
        OnlineClass spring_boot = new OnlineClass(1, "springboot", true);

        Optional<Progress> progress = spring_boot.getProgress();
        if (progress.isPresent()) {
            System.out.println("Not null");
        }
    }
}
