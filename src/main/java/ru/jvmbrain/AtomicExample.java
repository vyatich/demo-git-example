package ru.jvmbrain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    private static volatile int sum = 0;
    private static AtomicInteger safeSum = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ThreadWorker worker = new ThreadWorker();
            threadList.add(worker);
            worker.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println(safeSum);
    }

    static class ThreadWorker extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
//                sum++;
                safeSum.getAndIncrement();
            }
        }
    }
}
