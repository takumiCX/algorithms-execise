package com.takumicx;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * @author: takumiCX
 * @create: 2019-03-10
 * @email: takumicx@zju.edu.cn
 **/
public class IntegerTest {

    public static void main(String[] args) {


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            new Counter().increase();
        }
        long end = System.currentTimeMillis();
        System.out.println("AtomicLong:" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            new Counter().increase();
        }
        end = System.currentTimeMillis();
        System.out.println("AtomicLongFieldUpdater:"+(end - start));

        Integer.valueOf(1);


    }

    static class Counter {
        private final AtomicLong counter = new AtomicLong();

        public void increase() {
            counter.incrementAndGet();
        }
    }

    static class CompactCounter {

        private volatile long counter;
        private static final AtomicLongFieldUpdater<CompactCounter> updater = AtomicLongFieldUpdater.newUpdater(CompactCounter.class, "counter");

        public void increase() {
            updater.incrementAndGet(this);
        }
    }

}
