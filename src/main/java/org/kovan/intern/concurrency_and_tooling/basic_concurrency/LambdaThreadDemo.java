package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

public class LambdaThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Running");
        });
        thread.start();
    }
}
