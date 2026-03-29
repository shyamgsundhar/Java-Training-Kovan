package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

public class ThreadFunctionsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for(int i=0;i<=3;i++){
                System.out.println("Child: "+i);
            }
            try{
                Thread.sleep(1000);
                //System.out.println("Ended");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
       thread.join();
        System.out.println("Main continues");
    }
}
