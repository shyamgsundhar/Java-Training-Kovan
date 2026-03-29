package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    //int count=0;
    AtomicInteger count = new AtomicInteger(0);
//    public  void add(){
//        count++;
//    }
    public void add(){
        count.incrementAndGet();
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            threads[i]=new Thread(
                    ()->{
                        for(int j=0;j<1000;j++){
                            counter.add();
                        }
                    }
            );
        }
        for(int i=0;i<10;i++){
            threads[i].start();
        }
        for (int i=0;i<10;i++){
            threads[i].join();
        }
        System.out.println("The Final Count is "+counter.count);
    }
}
