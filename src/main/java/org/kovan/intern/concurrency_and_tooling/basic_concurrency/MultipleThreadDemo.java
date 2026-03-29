package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

class MultipleThreads extends Thread{
    private String name;
    MultipleThreads(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name+" is Running "+currentThread().threadId()+" "+currentThread().getName());
    }
}
public class MultipleThreadDemo {
    public static void main(String[] args) {
        MultipleThreads threads1=new MultipleThreads("Thread 1");
        MultipleThreads threads2=new MultipleThreads("Thread 2");
        MultipleThreads threads3=new MultipleThreads("Thread 3");
        MultipleThreads threads4=new MultipleThreads("Thread 4");
        threads1.start();
        threads2.start();
        threads3.start();
        threads4.start();
    }
}
