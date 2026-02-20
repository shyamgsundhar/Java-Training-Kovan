package org.kovan.intern.concurrency_and_tooling.advanced_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<=5;i++){
            int id=i;
            executorService.execute(()->{
                System.out.println("Task "+id+" by "+Thread.currentThread().getName());
            });
        }
    }
}
