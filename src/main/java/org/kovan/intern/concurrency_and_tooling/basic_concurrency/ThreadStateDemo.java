package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.sleep(1000);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
    }
}
