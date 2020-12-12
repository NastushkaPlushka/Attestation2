package com.company;

public class Main {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.isAlive();
        t.isInterrupted();
        t.run();
        t.start();

        System.out.println("Main thread started...");
        CommonResurse commonResurse = new CommonResurse();
        for( int i =1; i<5; i++){
            Thread t = new Thread(new CountThread(commonResurse), "Thread" +i);
            t.start();
        }
        System.out.println("Main thread finished");





    }
}
