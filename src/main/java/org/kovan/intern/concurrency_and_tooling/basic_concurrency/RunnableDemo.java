package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

import static java.lang.Thread.currentThread;

class NewRunnable implements Runnable{
    public void run(){
        System.out.println("Running "+currentThread().threadId()+" "+currentThread().getName());
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread( new NewRunnable());
        t.start();
    }
}
