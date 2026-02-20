package org.kovan.intern.concurrency_and_tooling.advanced_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            int id=i;
            executorService.execute(()->{
                System.out.println("Task "+id+" started by "+Thread.currentThread().getName());
                try{
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("......................Task "+id+" finished by "+Thread.currentThread().getName());
            });

        }
        executorService.shutdown();
    }
}
