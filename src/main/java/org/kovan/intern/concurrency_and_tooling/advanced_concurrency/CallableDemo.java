package org.kovan.intern.concurrency_and_tooling.advanced_concurrency;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> callable = ()->{
            System.out.println("Task Running on "+Thread.currentThread().getName());
            Thread.sleep(1000);
            return 59;
        };
        Future<Integer> future= executorService.submit(callable);
        System.out.println(future.get());
    }
}
