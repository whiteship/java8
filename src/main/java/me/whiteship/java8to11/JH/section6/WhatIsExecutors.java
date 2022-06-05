package me.whiteship.java8to11.JH.section6;

import java.util.concurrent.*;

public class WhatIsExecutors {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // execute
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread " + Thread.currentThread().getName());
            }
        });

        // submit
        executorService.submit(() -> {
            System.out.println("Thread " + Thread.currentThread().getName());
        });

        // shutdown
        executorService.shutdown();

        // FixedThreadPool
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        executorService2.submit(getRunnable("FixedThreadPool_1"));
        executorService2.submit(getRunnable("FixedThreadPool_2"));
        executorService2.submit(getRunnable("FixedThreadPool_3"));
        executorService2.submit(getRunnable("FixedThreadPool_4"));
        executorService2.submit(getRunnable("FixedThreadPool_5"));

        executorService2.shutdown();

        // SingleThreadScheduledExecutor
        ScheduledExecutorService executorService3 = Executors.newSingleThreadScheduledExecutor();
        executorService3.schedule(getRunnable("SingleThreadScheduledExecutor_1"), 3, TimeUnit.SECONDS);
        executorService3.scheduleWithFixedDelay(getRunnable("SingleThreadScheduledExecutor_2"), 1, 2, TimeUnit.SECONDS);

    }

    // Runnable
    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
