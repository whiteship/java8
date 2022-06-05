package me.whiteship.java8to11.JH.section6;

public class HowToUseThread {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Inheritance
        MyThread myThread  = new MyThread();
        myThread.start();    // Hello Thread-0

        // Lambda
        Thread threadUsingLambda = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName());
        });
        threadUsingLambda.start();    // // Hello Thread-1

        // Sleep
        java.lang.Thread threadSleep = new java.lang.Thread(() -> {
            System.out.println("Thread " + java.lang.Thread.currentThread().getName());
            try {
                java.lang.Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        threadSleep.start();

        // Join
        Thread threadJoin = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        threadJoin.start();

        try {
            threadJoin.join();    // Thread를 기다린다.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
