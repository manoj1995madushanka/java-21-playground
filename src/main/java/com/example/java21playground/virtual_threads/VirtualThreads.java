package com.example.java21playground.virtual_threads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreads {

    public void testVirtualThread() {

        /**
         * If I increase thread count in the pool to large number it will throw an execption due to system resources
         * over utilized and memory exceed
         * */
        try (var executor = Executors.newFixedThreadPool(1)) {
            IntStream.range(0, 99999).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }

        /**
         * To fix above issue we can use virtual threads
         * In below code it complete before above example without any error
         * */
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 99999).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }
    }
}
