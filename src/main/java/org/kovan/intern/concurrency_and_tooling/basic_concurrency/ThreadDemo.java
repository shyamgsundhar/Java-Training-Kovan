package org.kovan.intern.concurrency_and_tooling.basic_concurrency;

class NewThread extends Thread{

    public void run(){
        System.out.println("Running....");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
        if(newThread.isAlive()){
            System.out.println("Still Alive");
        }
        System.out.println("Ended");
    }
}
